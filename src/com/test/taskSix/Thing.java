package com.test.taskSix;

public class Thing {

  private final int weight;
  private final int value;
  private final double ratio;
  private static int totalWeight = 0;

  public Thing(int weight, int value) {
    this.weight = weight;
    this.value = value;
    this.ratio = setRatio(weight, value);
    totalWeight += weight;
  }

  private double setRatio(int weight, int value) {
    return (double) value / (double) weight;
  }

  public double getRatio() {
    return ratio;
  }

  public static int getTotalWeight() {
    return totalWeight;
  }

  public static void setTotalWeight(int totalWeight) {
    Thing.totalWeight = totalWeight;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return " {Вес вещи в рюкзаке: " + this.weight + ", Стоимость вещи в рюкзаке: " + this.value + "} ";
  }
}
