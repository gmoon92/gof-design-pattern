package com.gmoon.designpatterns.behavioral.chainofresponsibility.http.handler;

import com.gmoon.designpatterns.behavioral.chainofresponsibility.http.Request;

public class AuthRequestHandler extends RequestHandler {

  public AuthRequestHandler() {
  }

  public AuthRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  void preProcessor(Request request) {
    System.out.println("인증이 되었는가?");
  }
}
