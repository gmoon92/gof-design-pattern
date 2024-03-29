package com.gmoon.designpatterns.structural.composite.order;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Basket implements Order {

  // child component
  private final List<Order> values = new ArrayList<>();

  public void add(Order order) {
    values.add(order);
  }

  @Override
  public int getPrice() {
    return values.stream()
      .mapToInt(Order::getPrice)
      .sum();
  }
}
