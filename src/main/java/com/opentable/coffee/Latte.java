package com.opentable.coffee;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Latte extends Coffee {

  private final Coffee coffee;

  @Override
  public String getName() {
    return coffee + "Latte";
  }

  @Override
  public int getCost() {
    return coffee.getCost() + 10;
  }
}
