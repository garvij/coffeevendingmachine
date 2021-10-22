package com.opentable.coffee;

import com.opentable.coffee.decorators.CoffeeIngredientName;
import com.opentable.exceptions.SoldOutException;
import com.opentable.inventory.Inventory;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CoffeeMaker {

  private final Inventory<String> ingredientInventory;

  public int chooseProductAndGetPrice(CoffeeName coffeeName, List<CoffeeIngredientName> addOns) {
    var coffee = CoffeeFactory.create(coffeeName);
    for (var addOn : addOns) {
      coffee = CoffeeFactory.addAddOn(addOn, coffee);
    }
    validateAndUpdateInventory(coffee);
    return coffee.getCost();
  }

  private void validateAndUpdateInventory(Coffee coffee) {
    for (var ingredient : coffee.getCoffeeDecoratorQuantityMap().entrySet()) {
      if (ingredientInventory.hasItem(ingredient.getKey())) {
        ingredientInventory.removeItem(ingredient.getKey());
      } else {
        throw new SoldOutException(coffee.getName());
      }
    }
  }


}
