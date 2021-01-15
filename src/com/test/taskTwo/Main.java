package com.test.taskTwo;

import com.test.taskOne.TaskOne;
import java.util.Scanner;

public class Main extends TaskOne {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TaskTwo result = new TaskTwo();
    result.setNumberOne("Введите первое число: ", in);
    result.setNumberTwo("Введите второе число: ", in);

    result.nokAndNod();
  }


}
