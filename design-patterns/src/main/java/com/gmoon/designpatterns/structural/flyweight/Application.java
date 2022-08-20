package com.gmoon.designpatterns.structural.flyweight;

import com.gmoon.designpatterns.structural.flyweight.character.Character;
import com.gmoon.designpatterns.structural.flyweight.character.FontFactory;

public class Application {

  public static void main(String[] args) {
    FontFactory fontFactory = new FontFactory();
    Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
    Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
    Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));

    assert isEqualsSystemHashCode(c1.getFont(), c2.getFont());
    assert isEqualsSystemHashCode(c1.getFont(), c3.getFont());
  }

  private static boolean isEqualsSystemHashCode(Object o1, Object o2) {
    return System.identityHashCode(o1) == System.identityHashCode(o2);
  }
}
