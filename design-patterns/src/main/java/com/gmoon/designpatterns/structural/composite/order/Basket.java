package com.gmoon.designpatterns.structural.composite.order;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Basket {

  private final List<Item> items = new ArrayList<>();

  public void add(Item item) {
    items.add(item);
  }
}
