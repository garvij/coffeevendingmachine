package com.opentable;

import com.opentable.coffee.Coffee;
import com.opentable.coffee.CoffeeName;
import com.opentable.coffee.decorators.CoffeeIngredientName;
import java.util.List;

public interface VendingMachine {

  int chooseProductAndGetPrice(CoffeeName coffeeName, List<CoffeeIngredientName> addOns);

  void insertMoney(int money);

  Coffee getProductAndBalanceAmount();


}
