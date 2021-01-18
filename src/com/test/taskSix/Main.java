package com.test.taskSix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

   /**
    * Имеется набор вещей, которые необходимо поместить в рюкзак.
    * Рюкзак обладает заданной грузоподъемностью. Вещи в свою
    * очередь обладают двумя параметрами — весом и стоимостью. Цель
    * задачи заполнить рюкзак не превысив его грузоподъемность и
    * максимизировать суммарную ценность груза.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Backpack backpack = new Backpack(in);
    List<Thing> thingsForBackpack = new ArrayList<>();

    do {
      thingsForBackpack.add(backpack.createThing(in));
    } while (thingsForBackpack.size() != backpack.getQuantity());

    backpack.makeCombinations(thingsForBackpack);
    System.out.println(Arrays.toString(backpack.getBestCombination().toArray()));
  }
}
