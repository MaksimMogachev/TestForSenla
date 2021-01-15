package com.test.taskFive;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskFive result = new TaskFive();

    result.setNumber(in);
    result.findPalindrome();
  }


}
