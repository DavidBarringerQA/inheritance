package com.qa.inheritance;

public class Skateboard extends Vehicle {

  private String material;

  public Skateboard(String material) {
    super(4, 10, "skateboard");
    this.material = material;
  }

  public void trick() {
    System.out.println("You do a trick on the skateboard. Very cool.");
  }

  public String getMaterial() {
    return this.material;
  }

  public float bill() {
    float cost = this.getWheels() * this.getMaxSpeed();
    if (this.material.equals("Metal")) {
      cost += 49.99;
    } else {
      cost += 19.99;
    }
    return cost;
  }
}
