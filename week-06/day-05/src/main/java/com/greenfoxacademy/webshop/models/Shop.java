package com.greenfoxacademy.webshop.models;

import java.util.ArrayList;
import java.util.List;

public class Shop {
  private List<ShopItem> items = new ArrayList() {{

  }};

  public Shop() {
    this.items.add(new ShopItem("Running shoes", "Nike runing shoes for every day sport", 1000, 5, ItemType.CLOTHES));
    this.items.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2, ItemType.ELECTRONIC));
    this.items.add(new ShopItem("Coca Cola", "0.5l standard coke", 25, 0, ItemType.SNACK));
    this.items.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100, ItemType.SNACK));
    this.items.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1, ItemType.CLOTHES));
  }

  public List<ShopItem> getItems() {
    return items;
  }
}
