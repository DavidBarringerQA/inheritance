package com.qa.inheritance;

public class SmallCat extends Cat {

  public SmallCat() {
    super("", "small cat", 4, 0);
  }

  public SmallCat(String name, String species, int legs, int age) {
    super(name, species, legs, age);
  }

  public void speak() {
    System.out.println("Meow");
  }
}
