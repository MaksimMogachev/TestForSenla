package com.test.taskFive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFive {

  private int number;

  public void setNumber(Scanner in) {
    System.out.print("Введите, до какого числа искать палиндромы: ");
    int n = 0;

    try {
      n = in.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Было введено не число.");
      setNumber(new Scanner(System.in));
    }

    if (n <= 100 && n >= 0) {
      this.number = n;
    } else {
      System.out.println("Число должно быть от 0 до 100");
      setNumber(new Scanner(System.in));
    }
  }

  public void findPalindrome() {
    for (int i = 0; i < number; i++) {
      String check = String.valueOf(i);
      if (check.charAt(0) == check.charAt(check.length() - 1)) {
        System.out.println(check);
      }
    }
  }
}
