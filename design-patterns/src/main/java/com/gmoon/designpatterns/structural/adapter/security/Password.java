package com.gmoon.designpatterns.structural.adapter.security;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Password {
	private final String encodeId;
	private final String value;

	public String getPrefixEncodedPassword() {
		return String.format("{%s}%s", encodeId, value);
	}
}
