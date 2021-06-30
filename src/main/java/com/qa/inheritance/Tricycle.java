package com.qa.inheritance;

public class Tricycle extends Vehicle {
  private boolean basket;
  private boolean bell;

  public Tricycle(boolean basket, boolean bell) {
    super(3, 3, "tricycle");
    this.basket = basket;
    this.bell = bell;
  }

  public boolean hasBasket() {
    return this.basket;
  }

  public boolean hasBell() {
    return this.bell;
  }

  public void setBasket(boolean basket) {
    this.basket = basket;
  }

  public void setBell(boolean bell) {
    this.bell = bell;
  }

  public void ringBell() {
    if (bell) {
      System.out.println("You ring the bell.");
    } else {
      System.out.println("There is no bell to ring.");
    }
  }

  public float bill() {
    float cost = this.getWheels() * this.getMaxSpeed();
    if (bell) cost += 4.99;
    if (basket) cost += 8.99;
    return cost;
  }
}
