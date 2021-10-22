package com.opentable.coffee;

import com.opentable.coffee.decorators.CaramelSyrup;
import com.opentable.coffee.decorators.ChocolateSyrup;
import com.opentable.coffee.decorators.CoffeeIngredientName;
import com.opentable.coffee.decorators.Milk;
import com.opentable.coffee.decorators.Sugar;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CoffeeFactory {

  public static Coffee create(CoffeeName coffeeName) {
    switch (coffeeName) {
      case EXPRESSO:
        return new Expresso();
      case CAPPUCHINO:
        return addAddOn(CoffeeIngredientName.MILK, CoffeeFactory.create(CoffeeName.EXPRESSO));
      case LATTE:
        return addAddOn(CoffeeIngredientName.CHOCOLATE_SYRUP,
            CoffeeFactory.create(CoffeeName.EXPRESSO));
      default:
        throw new UnsupportedOperationException("Wrong coffee name: " + coffeeName);
    }
  }

  public static Coffee addAddOn(CoffeeIngredientName coffeeIngredientName, Coffee coffee) {
    switch (coffeeIngredientName) {
      case MILK:
        return new Milk(coffee);
      case SUGAR:
        return new Sugar(coffee);
      case CARAMEL_SYRUP:
        return new CaramelSyrup(coffee);
      case CHOCOLATE_SYRUP:
        return new ChocolateSyrup(coffee);
      default:
        throw new UnsupportedOperationException("Wrong coffee add on: " + coffeeIngredientName);
    }
  }
}