package com.opentable.coffee.decorators;

import com.opentable.coffee.Coffee;
import java.util.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CaramelSyrup extends CoffeeIngredient {

  private final Coffee coffee;

  @Override
  public String getName() {
    return coffee.getName() + "," + CoffeeIngredientName.CARAMEL_SYRUP;
  }

  @Override
  public int getCost() {
    return coffee.getCost() + CoffeeIngredientName.CARAMEL_SYRUP.getPrice();
  }

  @Override
  public Map<String, Integer> getCoffeeDecoratorQuantityMap() {
    coffee.getCoffeeDecoratorQuantityMap()
        .merge(CoffeeIngredientName.CARAMEL_SYRUP.name(), 1, Integer::sum);
    return coffee.getCoffeeDecoratorQuantityMap();
  }
}
