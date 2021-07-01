package com.qa.inheritance;

public abstract class Animal {
  private String name;
  private String species;
  private int legs;
  private int age;

  public Animal() {
    this("", "", 0, 0);
  }

  public Animal(String name, String species, int legs, int age) {
    this.name = name;
    this.species = species;
    this.legs = legs;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public String getSpecies() {
    return this.species;
  }

  public int getLegs() {
    return this.legs;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
