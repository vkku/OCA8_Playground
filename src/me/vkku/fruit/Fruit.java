package me.vkku.fruit;

public abstract class Fruit {

  private String fruitMaster = "Mangifera Indica";
  private Double lifeFactor = 100.0;

  // Method can't be private because abstract class can't be instantiated
  public abstract Boolean tastesLikeHeaven();

  protected Double lifeExpectancyIncreasePercentage(Float prevExpectancy) {
    Double newExpectancy = prevExpectancy + lifeFactor * prevExpectancy;
    return newExpectancy;
  }

  public void setLifeFactor(Double lifeFactor) {
    this.lifeFactor = lifeFactor;
  }

  public Double getLifeFactor() {
    return this.lifeFactor;
  }

  public String getFruitMaster() {
    return fruitMaster;
  }

}
