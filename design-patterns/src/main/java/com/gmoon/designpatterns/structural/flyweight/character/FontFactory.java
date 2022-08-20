package com.gmoon.designpatterns.structural.flyweight.character;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

  private static final Map<String, Font> CACHE = new HashMap<>();

  public Font getFont(String findFont) {
    Font font = CACHE.get(findFont);
    if (font == null) {
      String[] split = findFont.split(":");
      String family = split[0];
      int size = Integer.parseInt(split[1]);

      Font newFont = new Font(family, size);
      CACHE.put(findFont, newFont);
      return newFont;
    }

    return font;
  }
}
