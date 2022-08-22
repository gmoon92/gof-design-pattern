package com.gmoon.designpatterns.behavioral.chainofresponsibility.http;

import lombok.Getter;

@Getter
public class Request {

  private final String body;

  public Request(String body) {
    this.body = body;
  }
}
