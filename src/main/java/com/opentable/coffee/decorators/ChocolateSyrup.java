package com.opentable.coffee.decorators;

import com.opentable.coffee.Coffee;
import java.util.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ChocolateSyrup extends CoffeeIngredient {

  private final Coffee coffee;

  @Override
  public String getName() {
    return coffee.getName() + ", " + CoffeeIngredientName.CHOCOLATE_SYRUP;
  }

  @Override
  public int getCost() {
    return coffee.getCost() + CoffeeIngredientName.CHOCOLATE_SYRUP.getPrice();
  }

  @Override
  public Map<String, Integer> getCoffeeDecoratorQuantityMap() {
    coffee.getCoffeeDecoratorQuantityMap()
        .merge(CoffeeIngredientName.CHOCOLATE_SYRUP.name(), 1, Integer::sum);
    return coffee.getCoffeeDecoratorQuantityMap();
  }
}
