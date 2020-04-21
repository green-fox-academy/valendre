package com.greenfoxacademy.exercises.models;

public class BankAccount {
  private String name;
  private float balance;
  private String animalType;
  private boolean king;
  private boolean good;

  public BankAccount(String name, float balance, String animalType, boolean king, boolean good) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.good = good;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public boolean isGood() {
    return good;
  }

  public void setGood(boolean good) {
    this.good = good;
  }
}

