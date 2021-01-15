package com.test.taskFour;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskFour {

  private Map<String, Integer> text;
  private String word;

  public String getWord() {
    return word;
  }

  public void setText(String print, Scanner in) {
    System.out.print(print);
    if (print.equals("Введите текст: ")) {
      this.text = createMap(in.nextLine());
    } else {
      this.word = in.nextLine();
    }
  }

  private Map<String, Integer> createMap(String in) {
    String[] result = in.split("[ .,:;]+");
    int counter = 0;
    Map<String, Integer> textMap = new HashMap<>();

    for (String word : result) {
      if (!textMap.containsKey(word)) {
        for (String value : result) {
          if (value.equalsIgnoreCase(word)) {
            counter++;
          }
        }
        textMap.put(word, counter);
        counter = 0;
      }
    }
    return textMap;
  }

  public void check(String word) {
    System.out.printf("Слово встречается: %d\n", this.text.get(word));
  }
}
