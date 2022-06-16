package com.gmoon.designpatterns.structural.adapter.hash;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PBKDF2 {
	public static final PBKDF2 INSTANCE = new PBKDF2();

	private static final SecretKeyFactory SECRET_KEY_FACTORY;

	static {
		try {
			final String ALGORITHM = "PBKDF2WithHmacSHA1";
			SECRET_KEY_FACTORY = SecretKeyFactory.getInstance(ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	// salt size at least 32 byte
	private static final int SALT_BYTE_SIZE = 32;
	private static final int HASH_BYTE_SIZE = 512;
	private static final int ITERATIONS = 10_000;

	private static final int INDEX_OF_ITERATION = 0;
	private static final int INDEX_OF_SALT = 1;
	private static final int INDEX_OF_PBKDF2 = 2;

	/**
	 * Returns a salted PBKDF2 hash of the password.
	 *
	 * @param   password    the password to hash
	 * @return a salted PBKDF2 hash of the password
	 */
	public String encode(String password) {
		// Generate a random salt
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[SALT_BYTE_SIZE];
		random.nextBytes(salt);

		// Hash the password
		byte[] hash = encode(password.toCharArray(), salt, ITERATIONS, HASH_BYTE_SIZE);
		// format iterations:salt:hash
		return ITERATIONS + ":" + toHex(salt) + ":" + toHex(hash);
	}

	/**
	 * Converts a byte array into a hexadecimal string.
	 *
	 * @param   array       the byte array to convert
	 * @return a length*2 character string encoding the byte array
	 */
	private String toHex(byte[] array) {
		BigInteger bi = new BigInteger(1, array);
		String hex = bi.toString(16);
		int paddingLength = (array.length * 2) - hex.length();
		if (paddingLength > 0)
			return String.format("%0" + paddingLength + "d", 0) + hex;
		else
			return hex;
	}

	/**
	 * Validates a password using a hash.
	 *
	 * @param   rawPassword    the password to check
	 * @param   encodedPassword    the hash of the valid password
	 * @return true if the password is correct, false if not
	 */
	public boolean validatePassword(String rawPassword, String encodedPassword) {
		// Decode the hash into its parameters
		String[] params = encodedPassword.split(":");
		int iterations = Integer.parseInt(params[INDEX_OF_ITERATION]);
		byte[] salt = fromHex(params[INDEX_OF_SALT]);
		byte[] hash = fromHex(params[INDEX_OF_PBKDF2]);
		// Compute the hash of the provided password, using the same salt,
		// iteration count, and hash length
		byte[] testHash = encode(rawPassword.toCharArray(), salt, iterations, hash.length);
		// Compare the hashes in constant time. The password is correct if both hashes match.
		return slowEquals(hash, testHash);
	}

	/**
	 * Converts a string of hexadecimal characters into a byte array.
	 *
	 * @param   hex         the hex string
	 * @return the hex string decoded into a byte array
	 */
	private byte[] fromHex(String hex) {
		byte[] binary = new byte[hex.length() / 2];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = (byte)Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
		}
		return binary;
	}

	/**
	 * Compares two byte arrays in length-constant time. This comparison method
	 * is used so that password hashes cannot be extracted from an on-line
	 * system using a timing attack and then attacked off-line.
	 *
	 * @param   a       the first byte array
	 * @param   b       the second byte array
	 * @return true if both byte arrays are the same, false if not
	 */
	private boolean slowEquals(byte[] a, byte[] b) {
		int diff = a.length ^ b.length;
		for (int i = 0; i < a.length && i < b.length; i++) {
			diff |= a[i] ^ b[i];
		}
		return diff == 0;
	}

	/**
	 *  Computes the PBKDF2 hash of a password.
	 *
	 * @param   password    the password to hash.
	 * @param   salt        the salt
	 * @param   iterations  the iteration count (slowness factor)
	 * @param   bytes       the length of the hash to compute in bytes
	 * @return the PBDKF2 hash of the password
	 */
	private byte[] encode(char[] password, byte[] salt, int iterations, int bytes) {
		PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, bytes * 8);
		try {
			return SECRET_KEY_FACTORY.generateSecret(spec).getEncoded();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Tests the basic functionality of the PasswordHash class
	 *
	 * @param   args        ignored
	 */
	public static void main(String[] args) {
		PBKDF2 pbkdf2 = PBKDF2.INSTANCE;
		String password = "123";

		for (int i = 0; i < 10; i++) {
			System.out.println(pbkdf2.encode(password));
		}

		System.out.println("Running tests...");
		for (int i = 0; i < 10; i++) {
			String hash = pbkdf2.encode(password);
			String secondHash = pbkdf2.encode(password);

			// Failure case1: Two hashes are equal!
			assert !hash.equals(secondHash);

			// Failure case2: Wrong password accepted!
			assert !pbkdf2.validatePassword("1234", hash);

			// Failure case3: Good password not accepted!
			assert pbkdf2.validatePassword(password, hash);
		}

		System.out.println("Done!");
	}
}
