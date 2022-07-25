package com.gmoon.designpatterns.structural.composite;

import com.gmoon.designpatterns.structural.composite.order.GiftBox;
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

    int vat = 100;
    GiftBox giftBox = new GiftBox(vat);
    giftBox.add(Item.create("birthday card", 100_000));
    basket.add(giftBox);

    System.out.println(note.getPrice());
    System.out.println(basket.getPrice());
  }
}
