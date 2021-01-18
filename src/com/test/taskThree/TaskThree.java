package com.test.taskThree;

import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {

  private String[] text;

  public void setText(Scanner in) {
    this.text = setter(in);
  }

  private String[] setter(Scanner in) {
    System.out.print("Введите текст: ");
    return in.nextLine().split("[ .!?,:;]+");
  }

  public void quantityAndToUpperCase() {
    Arrays.sort(this.text);
    System.out.printf("Слов в передложении: %d\n", this.text.length);

    for (int i = 0; i < this.text.length; i++) {
      char[] result = this.text[i].toCharArray();

      result[0] = Character.toUpperCase(result[0]);
      this.text[i] = new String(result);
    }
    System.out.println(Arrays.toString(this.text));
  }
}
