package com.test.taskSix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Backpack backpack = new Backpack(in);
    ArrayList<Thing> thingsForBackpack = new ArrayList<>();

    do {
      thingsForBackpack.add(backpack.createThing(in));
    } while (thingsForBackpack.size() != backpack.getQuantity());

    ArrayList<Thing> thingsInBackpack = backpack.fillTheBackpack(thingsForBackpack);
    System.out.println(Arrays.toString(thingsInBackpack.toArray()));
  }
}
