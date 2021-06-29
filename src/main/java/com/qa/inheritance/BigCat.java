package com.qa.inheritance;

public class BigCat extends Cat {

  public BigCat() {
    super("", "Big cat", 4, 0);
  }

  public BigCat(String name, String species, int legs, int age) {
    super(name, species, legs, age);
  }

  public void speak() {
    System.out.println("Roar");
  }
}
