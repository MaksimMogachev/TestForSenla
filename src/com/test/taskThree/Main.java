package com.test.taskThree;

import java.util.Scanner;

public class Main {

  /**
   * Создать программу, которая будет:
   * - подсчитывать количество слов в предложении
   * - выводить их в отсортированном виде
   * - делать первую букву каждого слова заглавной.
   * Предложение вводится вручную. (Разделитель пробел (“ ”)).
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskThree result = new TaskThree();

    result.setText(in);
    result.quantityAndToUpperCase();
  }
}
