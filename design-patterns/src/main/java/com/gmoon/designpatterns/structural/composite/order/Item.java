package com.gmoon.designpatterns.structural.composite.order;

import lombok.Getter;

@Getter
public class Item {
  private String name;
  private int price;

  public static Item create(String name, int price) {
    Item item = new Item();
    item.name = name;
    item.price = price;
    return item;
  }
}
