package com.gmoon.designpatterns.behavioral.chainofresponsibility;

import com.gmoon.designpatterns.behavioral.chainofresponsibility.http.Request;
import com.gmoon.designpatterns.behavioral.chainofresponsibility.http.handler.AuthRequestHandler;
import com.gmoon.designpatterns.behavioral.chainofresponsibility.http.handler.PrintRequestHandler;
import com.gmoon.designpatterns.behavioral.chainofresponsibility.http.handler.RequestHandler;

public class Application {

  private final RequestHandler requestHandler;

  public Application(RequestHandler requestHandler) {
    this.requestHandler = requestHandler;
  }

  private void doWork() {
    Request request = new Request("{id: \"gmoon\"}");
    requestHandler.handle(request);
  }

  public static void main(String[] args) {
    RequestHandler chain = new PrintRequestHandler(new AuthRequestHandler());
    Application client = new Application(chain);
    client.doWork();
  }
}
