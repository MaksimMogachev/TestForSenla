package com.test.taskSix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Backpack {

  private final int carryingCapacity;
  private final int quantity;

  public Backpack(Scanner in) {
    this.carryingCapacity = setCarryingCapacity(in);
    this.quantity = setQuantity(in);
  }

  public int getCarryingCapacity() {
    return carryingCapacity;
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

  public ArrayList<Thing> fillTheBackpack(ArrayList<Thing> thingsForBackpack) {

    for (Iterator<Thing> it = thingsForBackpack.iterator(); it.hasNext(); ) {
      Thing thing = it.next();
      if (thing.getWeight() >= this.carryingCapacity) {
        Thing.setTotalWeight(Thing.getTotalWeight() - thing.getWeight());
        it.remove();
      }
    }

    if (Thing.getTotalWeight() < this.carryingCapacity) {
      return thingsForBackpack;
    }

    do {
      Thing smallestRatio = thingsForBackpack.get(0);

      for (Thing thing : thingsForBackpack) {
        if (smallestRatio.getRatio() > thing.getRatio()) {
          smallestRatio = thing;
        }
      }

      Thing.setTotalWeight(Thing.getTotalWeight() - smallestRatio.getWeight());
      thingsForBackpack.remove(smallestRatio);

    } while (Thing.getTotalWeight() > this.getCarryingCapacity());
    return thingsForBackpack;
  }
}
