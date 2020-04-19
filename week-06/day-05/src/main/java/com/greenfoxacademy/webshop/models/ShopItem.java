package com.greenfoxacademy.webshop.models;

public class ShopItem {
  private String name, description;
  private float price;
  private int quantityOfStock;
  private ItemType type;

  public ShopItem(String name, String description, int price, int quantityOfStock, ItemType type) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
    this.type=type;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public float getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public ItemType getType() {
    return type;
  }
}
