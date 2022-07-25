package com.gmoon.designpatterns.structural.composite;

import com.gmoon.designpatterns.structural.composite.order.Item;
import com.gmoon.designpatterns.structural.composite.order.Basket;

public class Application {

  public static void main(String[] args) {
    Item note = Item.create("note", 1_000);
    Item pencil = Item.create("pencil", 3_000);
    Item eraser = Item.create("eraser", 500);

    Basket basket = new Basket();
    basket.add(note);
    basket.add(pencil);
    basket.add(eraser);

    Application client = new Application();
    System.out.println(client.getPrice(note));
    System.out.println(client.getPrice(basket));
  }

  private int getPrice(Item note) {
    return note.getPrice();
  }

  private int getPrice(Basket basket) {
    return basket.getItems().stream()
      .mapToInt(Item::getPrice)
      .sum();
  }
}
