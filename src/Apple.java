import me.vkku.fruit.Fruit;

public class Apple extends Fruit {
  private Boolean tastesLikeAnything = false; // Tastes like "apple"

  public static void main(String... args) {
    Apple apple = new Apple();
    Float actualLifeExpectancy = (float) 80;
    apple.setLifeFactor(0.02);
    System.out.println("Congrats ! Your age stretched from " + actualLifeExpectancy + " to "
        + apple.lifeExpectancyIncreasePercentage(actualLifeExpectancy));
  }

  @Override
  public Boolean tastesLikeHeaven() {
    return tastesLikeAnything;
  }

}
