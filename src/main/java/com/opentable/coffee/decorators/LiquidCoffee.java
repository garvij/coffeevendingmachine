package com.opentable.coffee.decorators;

import com.opentable.coffee.Coffee;
import java.util.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LiquidCoffee extends CoffeeIngredient {

  private final Coffee coffee;

  @Override
  public String getName() {
    return coffee.getName() + "," + CoffeeIngredientName.MILK;
  }

  @Override
  public int getCost() {
    return super.getCost() + CoffeeIngredientName.MILK.getPrice();
  }

  @Override
  public Map<String, Integer> getCoffeeDecoratorQuantityMap() {
    coffee.getCoffeeDecoratorQuantityMap()
        .merge(CoffeeIngredientName.MILK.name(), 1, Integer::sum);
    return coffee.getCoffeeDecoratorQuantityMap();
  }
}
