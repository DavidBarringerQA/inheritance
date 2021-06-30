package com.qa.inheritance;

public class Runner {

  public static void main(String[] args) {

    Garage garage = new Garage();
    garage.add(new Car(80, 1.4f, 5));
    garage.add(new Car(120, 1.2f, 3));
    garage.add(new Skateboard("Wood"));
    garage.add(new Skateboard("Metal"));
    garage.add(new Tricycle(true, false));
    garage.bills();
    System.out.println("Car 1: " + garage.fix(0) + "\nCar 2: " + garage.fix(1));
    garage.remove("Car");
    garage.bills();
    garage.clear();
    garage.bills();
    // SmallCat sCat = new SmallCat("Timmie", "Tortoiseshell", 4, 2);
    // BigCat bCat = new BigCat("Jimmy", "Leopard", 4, 10);
    // Whale whale = new Whale("Sally", "Beluga", 0, 20);
    // whale.speak();
    // sCat.speak();
    // bCat.speak();
    // whale.surface();
    // sCat.scratch(bCat);
  }
}
