package com.test.taskOne;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskOne result = new TaskOne();
    result.setNumber("Введите число для проверки: ", in);

    result.parityCheck();
    result.compositeCheck();
  }
}
