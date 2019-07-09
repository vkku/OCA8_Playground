import me.vkku.fruit.Fruit;


public class Apple extends Fruit {
  private Boolean tastesLikeAnything = false; // Tastes like "apple"

  public static void main(String... args) {
    Apple apple = new Apple();
    apple.setLifeFactor(0.02);
    System.out.println(apple.lifeExpectancyIncreasePercentage((float) 75.0));
  }

  @Override
  public Boolean tastesLikeHeaven() {
    return tastesLikeAnything;
  }

}
