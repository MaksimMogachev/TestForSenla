package com.test.taskSix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backpack {

  private final int carryingCapacity;
  private final int quantity;
  private List<Thing> bestCombination = null;
  private int maxPrice;

  public Backpack(Scanner in) {
    this.carryingCapacity = setCarryingCapacity(in);
    this.quantity = setQuantity(in);
  }

  public int getQuantity() {
    return quantity;
  }

  private int setCarryingCapacity(Scanner in) {
    System.out.print("Введите грузоподьемность рюкзака: ");
    return in.nextInt();
  }

  private int setQuantity(Scanner in) {
    System.out.print("Введите, сколько вещей будет внесено: ");
    return in.nextInt();
  }

  public List<Thing> getBestCombination() {
    return bestCombination;
  }


  public Thing createThing(Scanner in) {
    System.out.print("Введите вес вещи: ");
    int w = in.nextInt();

    System.out.print("Введите стоимость вещи: ");
    int v = in.nextInt();

    if (w < 1 || v < 1) {
      System.out.println("Введены некорректные данные.");
      return createThing(in);
    }

    return new Thing(w, v);
  }

  private int checkMaxWeight(List<Thing> thingsForBackpack) {
    int sum = 0;

    for (Thing thing : thingsForBackpack) {
      sum = sum + thing.getWeight();
    }
    return sum;
  }

  private int checkMaxPrice(List<Thing> thingsForBackpack) {
    int sum = 0;

    for (Thing thing : thingsForBackpack) {
      sum = sum + thing.getValue();
    }
    return sum;
  }

  private void checkList(List<Thing> things) {
    if (bestCombination == null) {
      if (checkMaxWeight(things) <= carryingCapacity) {
        bestCombination = things;
        maxPrice = checkMaxPrice(things);
      }
    }
    else {
      if(checkMaxWeight(things) <= carryingCapacity && checkMaxPrice(things) > maxPrice) {
        bestCombination = things;
        maxPrice = checkMaxPrice(things);
      }
    }
  }

  public void makeCombinations(List<Thing> things) {
    if (things.size() > 0)
      checkList(things);

    for (int i = 0; i < things.size(); i++) {
      List<Thing> newList = new ArrayList<>(things);

      newList.remove(i);
      makeCombinations(newList);
    }
  }
}
