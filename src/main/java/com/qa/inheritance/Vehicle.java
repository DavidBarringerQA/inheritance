package com.qa.inheritance;

public class Vehicle {
  private int wheels;
  private int maxSpeed;
  private String type;

  public Vehicle(int wheels, int maxSpeed, String type) {
    this.wheels = wheels;
    this.maxSpeed = maxSpeed;
    this.type = type;
  }

  public void accelerate() {
    System.out.println("The " + type + " goes faster.");
  }

  public void brake() {
    System.out.println("The " + type + " is braking.");
  }

  public void crash() {
    System.out.println("The " + type + " has crashed.");
  }

  public int getWheels() {
    return this.wheels;
  }

  public int getMaxSpeed() {
    return this.maxSpeed;
  }

  public String getType() {
    return this.type;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public float bill() {
    return (float) this.wheels * this.maxSpeed;
  }
}
