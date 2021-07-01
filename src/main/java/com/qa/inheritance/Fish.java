package com.qa.inheritance;

public class Fish extends Animal implements Speak, Swim{
  public Fish (){
    super("","Fish",0,0);
  }

  public Fish (String name, int legs, int age){
    super(name, "Fish", legs, age);
  }

  public void speak(){
    System.out.println("Blub");
  }

  public void shout(){
    System.out.println("BLUB!");
  }

  public void swim(){
    System.out.println("The fish swims");
  }
}
