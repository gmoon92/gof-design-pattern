package com.gmoon.designpatterns.structural.composite.order;

import java.util.ArrayList;
import java.util.List;

public class GiftBox implements Order {

  private final int vat;

  private final List<Order> values = new ArrayList<>();

  public GiftBox(int vat) {
    this.vat = vat;
  }

  public void add(Order order) {
    values.add(order);
  }

  @Override
  public int getPrice() {
    return values.stream()
      .mapToInt(Order::getPrice)
      .reduce(0, (price, other) -> Integer.sum(price, other) + vat);
  }
}
