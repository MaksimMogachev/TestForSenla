package com.test.taskOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

  private int number;

  public void setNumber(String print, Scanner in) {
    this.number = setter(print, in);
  }

  protected int setter(String print, Scanner in) {
    System.out.print(print);
    int n;

    try {
      n = in.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Введено не целое число.");
      return setter(print, new Scanner(System.in));
    }

    if (n < 1) {
      System.out.println("Введите другое число.");
      return setter(print, new Scanner(System.in));
    }
    return n;
  }

  public void parityCheck() {
    if (this.number % 2 == 0) {
      System.out.println("Число чётное");
    } else {
      System.out.println("Число не чётное");
    }
  }

  public void compositeCheck() {
    if (this.number > 0) {
      for (int i = 2; i < this.number; i++) {
        if (this.number % i == 0) {
          System.out.println("Число составное");
          return;
        }
      }
    } else {
      for (int i = -2; i > this.number; i--) {
        if (this.number % i == 0) {
          System.out.println("Число составное");
          return;
        }
      }
    }
    System.out.println("Число простое");
  }
}
