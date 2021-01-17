package com.test.taskFive;

import java.util.Scanner;

public class Main {

  /**
   * Создать программу, которая в последовательности от 0 до N, находит
   * все числа-палиндромы (зеркальное значение равно оригинальному).
   * Длина последовательности N вводится вручную и не должна
   * превышать 100.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskFive result = new TaskFive();

    result.setNumber(in);
    result.findPalindrome();
  }


}
