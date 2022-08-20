package com.gmoon.designpatterns.structural.proxy.game;

public class DefaultGameService implements GameService {

  @Override
  public void startGame() {
    System.out.println("start game...");
  }
}
