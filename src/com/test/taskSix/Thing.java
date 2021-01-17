package com.test.taskSix;

public class Thing {

  private final int weight;
  private final int value;
  private final double ratio;

  public Thing(int weight, int value) {
    this.weight = weight;
    this.value = value;
    this.ratio = setRatio(weight, value);
  }

  private double setRatio(int weight, int value) {
    return (double) value / (double) weight;
  }

  public double getRatio() {
    return ratio;
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
