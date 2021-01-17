package com.test.taskTwo;

import com.test.taskOne.TaskOne;
import java.util.Scanner;

public class TaskTwo extends TaskOne {

  private int numberOne;
  private int numberTwo;

  public void setNumberOne(String print, Scanner in) {
    this.numberOne = setter(print, in);
  }

  public void setNumberTwo(String print, Scanner in) {
    this.numberTwo = setter(print, in);
  }

  private int nod(int n1, int n2) {
    int NOD = 0;

    if (n1 > n2) {
      if (n1 % n2 == 0) {
        NOD = n2;
      } else {
        return nod(n1 % n2, n2);
      }
    }
    if (n2 > n1) {
      if (n2 % n1 == 0) {
        NOD = n1;
      } else {
        return nod(n2 % n1, n1);
      }
    }
    return NOD;
  }

  private int nok(int nod) {
    return (this.numberOne * this.numberTwo) / nod;
  }

  public void nokAndNod() {
    int NOD = nod(this.numberOne, this.numberTwo);
    int NOK = nok(NOD);
    System.out.format("Наибольший общий делитель: %s\n", NOD);
    System.out.format("Наименьшее общее кратное: %s\n", NOK);
  }
}
