package com.qa.inheritance;

  public class BigCat extends Cat implements Speak, Swim {

  public BigCat() {
    super("", "Big cat", 4, 0);
  }

  public BigCat(String name, String species, int legs, int age) {
    super(name, species, legs, age);
  }

  public void speak() {
    System.out.println("Roar");
  }

  public void shout() {
    System.out.println("ROAR");
  }

  public void swim() {
    System.out.println("The big cat swims");
  }
}
