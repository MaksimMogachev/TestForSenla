package com.test.taskSix;

public class Thing {

  private final int weight;
  private final int value;

  public Thing(int weight, int value) {
    this.weight = weight;
    this.value = value;
  }

  public int getWeight() {
    return weight;
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    return " {Вес вещи в рюкзаке: " + this.weight + ", Стоимость вещи в рюкзаке: " + this.value + "}";
  }
}
