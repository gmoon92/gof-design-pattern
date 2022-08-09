package com.gmoon.designpatterns.structural.facade.email;

public class EmailSender {

  public void sendMessage(String message) {
    System.out.format("message: %s\n", message);
  }
}
