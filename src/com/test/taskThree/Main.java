package com.test.taskThree;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskThree result = new TaskThree();
    result.setText(in);

    result.quantityAndToUpperCase();
  }
}
