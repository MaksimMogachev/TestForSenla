package com.test.taskFour;

import java.util.Scanner;

public class Main {

  /**
   * Создать программу, которая подсчитывает сколько раз употребляется
   * слово в тексте (без учета регистра).
   * Текст и слово вводится вручную.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskFour result = new TaskFour();
    result.setText("Введите текст: ", in);

    do {
      result.setText("Введите слово для подсчета: ", in);
      result.check(result.getWord());
    } while (!result.getWord().equals(""));
  }
}
