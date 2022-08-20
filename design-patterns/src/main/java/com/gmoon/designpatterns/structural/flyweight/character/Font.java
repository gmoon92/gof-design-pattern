package com.gmoon.designpatterns.structural.flyweight.character;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public final class Font {

  private final String family;
  private final int size;
}
