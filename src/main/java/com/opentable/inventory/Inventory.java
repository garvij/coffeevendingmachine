package com.opentable.inventory;


import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Inventory<T> {

  private final Map<T, Integer> inventory = new HashMap<>();

  public boolean hasItem(T item) {
    return getQuantity(item) > 0;
  }

  public int getQuantity(T item) {
    return inventory.getOrDefault(item, 0);
  }

  public void addItem(T item) {
    inventory.merge(item, 1, Integer::sum);
  }

  public void removeItem(T item) {
    if (!inventory.containsKey(item)) {
      return;
    }
    inventory.merge(item, -1, Integer::sum);
  }


}
