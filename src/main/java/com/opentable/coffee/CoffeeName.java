package com.opentable.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CoffeeName {
  CAPPUCHINO(10),
  EXPRESSO(10),
  LATTE(10);

  private final int price;

}
