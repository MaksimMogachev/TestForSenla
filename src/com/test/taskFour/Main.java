package com.test.taskFour;

import java.util.Scanner;

public class Main {

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
