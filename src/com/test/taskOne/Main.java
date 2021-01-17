package com.test.taskOne;

import java.util.Scanner;

public class Main {

  /**
   * Создать программу, которая будет сообщать, является ли целое
   * число, введенное пользователем, чётным или нечётным, простым
   * или составным.  Если пользователь введёт не целое число, то
   * сообщать ему об ошибке.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskOne result = new TaskOne();
    result.setNumber("Введите число для проверки: ", in);

    result.parityCheck();
    result.compositeCheck();
  }
}
