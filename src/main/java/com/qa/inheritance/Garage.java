package com.qa.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage {

  private List<Vehicle> garage;

  public Garage() {
    garage = new ArrayList<Vehicle>();
  }

  public void add(Vehicle vehicle) {
    garage.add(vehicle);
  }

  public void remove(int id) {
    if (id < garage.size()) {
      garage.remove(id);
    }
  }

  public void remove(String type) {
    for (int i = 0; i < garage.size(); i++) {
      if (garage.get(i).getType().equals(type)) {
        garage.remove(i--);
      }
    }
  }

  public void clear() {
    garage.clear();
    System.out.println("Garage cleared!");
  }

  public float fix(int index) {
    return garage.get(index).bill();
  }

  public void bills() {
    for (Vehicle vehicle : garage) {
      System.out.println(vehicle.bill());
    }
  }
}
