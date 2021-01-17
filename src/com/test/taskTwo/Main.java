package com.test.taskTwo;

import java.util.Scanner;

public class Main {

  /**
   * Создать программу, которая будет вычислять и выводить на экран
   * НОК (наименьшее общее кратное) и НОД (наибольший общий
   * делитель) двух целых чисел, введенных пользователем.
   * Если пользователь некорректно введёт хотя бы одно из чисел, то
   * сообщать об ошибке.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskTwo result = new TaskTwo();
    result.setNumberOne("Введите первое число: ", in);
    result.setNumberTwo("Введите второе число: ", in);

    result.nokAndNod();
  }


}
