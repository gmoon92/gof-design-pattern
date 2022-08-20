package com.gmoon.designpatterns.structural.proxy.game;

public class ProxyGameService implements GameService {

  private GameService gameService;

  @Override
  public void startGame() {
    long before = System.currentTimeMillis();

    if (gameService == null) {
      gameService = new DefaultGameService();
    }
    gameService.startGame();

    System.out.println(System.currentTimeMillis() - before);
  }
}
