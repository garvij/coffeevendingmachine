package com.opentable.coffee;

public class Expresso extends Coffee {


  @Override
  public String getName() {
    return CoffeeName.EXPRESSO.name();
  }

  @Override
  public int getCost() {
    return CoffeeName.EXPRESSO.getPrice();
  }
}
