package com.qa.inheritance;

public class Whale extends Animal {

  public Whale() {
    super("", "whale", 0, 0);
  }

  public Whale(String name, String species, int legs, int age) {
    super(name, species, legs, age);
  }

  public void speak() {
    System.out.println("Whale noise");
  }

  public void surface() {
    System.out.println("The " + this.getSpecies() + " breaches the water");
  }
}
