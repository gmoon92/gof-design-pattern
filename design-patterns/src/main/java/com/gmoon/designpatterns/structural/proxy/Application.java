package com.gmoon.designpatterns.structural.proxy;

import com.gmoon.designpatterns.structural.proxy.game.GameService;
import com.gmoon.designpatterns.structural.proxy.game.ProxyGameService;

public class Application {

  public static void main(String[] args) {
    GameService service = new ProxyGameService();

    service.startGame();
  }
}
