package com.gmoon.designpatterns.behavioral.chainofresponsibility.http.handler;

import com.gmoon.designpatterns.behavioral.chainofresponsibility.http.Request;

public class PrintRequestHandler extends RequestHandler {

  public PrintRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  void preProcessor(Request request) {
    System.out.println("body: " + request.getBody());
  }
}
