package com.qa.inheritance;

public class Car extends Vehicle {

  private float fuelCapacity;
  private float currentFuel;
  private int doors;

  public Car(int maxSpeed, float fuelCapacity, int doors) {
    super(4, maxSpeed, "Car");
    this.fuelCapacity = fuelCapacity;
    this.doors = doors;
  }

  public void honkHorn() {
    System.out.println("Honk");
  }

  public float refuel(int pricePerLitre) {
    float cost = (this.fuelCapacity - this.currentFuel) * pricePerLitre;
    this.currentFuel = this.fuelCapacity;
    return cost;
  }

  public float getFuelCapacity() {
    return this.fuelCapacity;
  }

  public float getCurrentFuel() {
    return this.currentFuel;
  }

  public int getDoors() {
    return this.doors;
  }

  public void setCurrentFuel(float currentFuel) {
    this.currentFuel = currentFuel;
  }

  public float bill() {
    return (this.getWheels() * this.getMaxSpeed()) + this.doors + this.refuel(140);
  }
}
