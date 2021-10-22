package com.opentable;

import com.opentable.coffee.Coffee;
import com.opentable.coffee.CoffeeMaker;
import com.opentable.coffee.CoffeeName;
import com.opentable.coffee.decorators.CoffeeIngredientName;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VendingMachineImpl implements VendingMachine {

  private final CoffeeMaker coffeeMaker;

  public int chooseProductAndGetPrice(CoffeeName coffeeName, List<CoffeeIngredientName> addOns) {
    return coffeeMaker.chooseProductAndGetPrice(coffeeName, addOns);
  }

  @Override
  public void insertMoney(int money) {

  }

  @Override
  public Coffee getProductAndBalanceAmount() {
    return null;
  }
}
