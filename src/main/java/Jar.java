import java.util.Random;

public class Jar{
  private String itemName;
  private int maxItemNumber;
  private int currentNumber;
  
  //Create Jar class with two parameters.
  public Jar(String itemName, int maxItemNumber) {
    this.itemName = itemName;
    this.maxItemNumber = maxItemNumber;
  }
  
  //Create getter methods to retrieve the values of instances variables.
  public String getItemName() {
    return itemName;
  }
  
  public int getMaxItemNumber() {
    return maxItemNumber;
  }
  
  //Create a fill method with random method to generate a random number.
  public void fill() {
    Random random = new Random();
    currentNumber = random.nextInt(maxItemNumber) + 1;
  }
  
  //Retrieve random number
  public int getCurrentNumber() {
    return currentNumber;
  } 
  
}