package com.opentable.coffee;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Cappuchino extends Coffee {

  private final Coffee coffee;

  @Override
  public String getName() {
    return coffee + ", " + CoffeeName.CAPPUCHINO;
  }

  @Override
  public int getCost() {
    return coffee.getCost() + CoffeeName.CAPPUCHINO.getPrice();
  }
}
