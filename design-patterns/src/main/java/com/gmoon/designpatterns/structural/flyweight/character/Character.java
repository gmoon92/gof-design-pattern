package com.gmoon.designpatterns.structural.flyweight.character;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Character {

  private final char value;
  private final String color;
  private final Font font;
}
