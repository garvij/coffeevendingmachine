package com.opentable.coffee;

import java.util.Map;
import lombok.Getter;

@Getter
public abstract class Coffee {

  private String name;
  private int cost;
  private Map<String, Integer> coffeeDecoratorQuantityMap;

}
