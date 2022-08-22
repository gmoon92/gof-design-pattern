package com.gmoon.designpatterns.behavioral.chainofresponsibility.http.handler;

import com.gmoon.designpatterns.behavioral.chainofresponsibility.http.Request;

public abstract class RequestHandler {

  private RequestHandler nextHandler;

  public RequestHandler() {

  }

  public RequestHandler(RequestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  abstract void preProcessor(Request request);

  public void handle(Request request) {
    preProcessor(request);

    if (nextHandler != null) {
      nextHandler.handle(request);
    }
  }
}
