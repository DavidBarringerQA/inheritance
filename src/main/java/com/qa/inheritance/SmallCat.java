package com.qa.inheritance;

public class SmallCat extends Cat implements Speak, Swim {

  public SmallCat() {
    super("", "small cat", 4, 0);
  }

  public SmallCat(String name, String species, int legs, int age) {
    super(name, species, legs, age);
  }

  public void speak() {
    System.out.println("Meow");
  }

  public void shout() {
    System.out.println("ROAR");
  }

  public void swim() {
    System.out.println("The small cat does not like water, it has elected not to swim.");
  }
}
