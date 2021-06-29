package com.qa.inheritance;

public class Runner {

  public static void main(String[] args) {

    SmallCat sCat = new SmallCat("Timmie", "Tortoiseshell", 4, 2);
    BigCat bCat = new BigCat("Jimmy", "Leopard", 4, 10);
    Whale whale = new Whale("Sally", "Beluga", 0, 20);
    whale.speak();
    sCat.speak();
    bCat.speak();
    whale.surface();
    sCat.scratch(bCat);
  }
}
