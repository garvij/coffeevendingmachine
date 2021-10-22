package com.opentable;

import com.opentable.coffee.Coffee;
import com.opentable.coffee.decorators.CoffeeIngredientName;
import java.util.List;
import lombok.Data;

@Data
public class Product {

  private Coffee coffee;
  private List<CoffeeIngredientName> addOns;

}
