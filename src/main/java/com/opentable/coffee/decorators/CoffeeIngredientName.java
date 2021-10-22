package com.opentable.coffee.decorators;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CoffeeIngredientName {

  LIQUID_COFFEE(5),
  MILK(2),
  SUGAR(0),
  CARAMEL_SYRUP(10),
  CHOCOLATE_SYRUP(10);

  private final int price;
}
