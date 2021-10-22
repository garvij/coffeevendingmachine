package com.opentable.coffee.decorators;

import com.opentable.coffee.Coffee;
import java.util.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Sugar extends CoffeeIngredient {

  private final Coffee coffee;

  @Override
  public String getName() {
    return coffee.getName() + ", " + CoffeeIngredientName.SUGAR;
  }

  @Override
  public int getCost() {
    return coffee.getCost();
  }

  @Override
  public Map<String, Integer> getCoffeeDecoratorQuantityMap() {
    coffee.getCoffeeDecoratorQuantityMap()
        .merge(CoffeeIngredientName.CHOCOLATE_SYRUP.name(), 1, Integer::sum);
    return coffee.getCoffeeDecoratorQuantityMap();
  }
}
