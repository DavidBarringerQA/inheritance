package com.qa.inheritance;

public class Cat extends Animal {

  public Cat() {
    super("", "cat", 4, 0);
  }

  public Cat(String name, String species, int legs, int age) {
    super(name, species, legs, age);
  }

  public void speak() {
    System.out.println("Cat noise");
  }

  public void scratch(Animal target) {
    System.out.println(this.getName() + " scratches " + target.getName());
  }
}
