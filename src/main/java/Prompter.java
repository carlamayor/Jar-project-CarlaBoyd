import java.util.Scanner;

public class Prompter {
  private Scanner scanner;
  
  //Set Up Input and output
  //Create a scanner.
  public Prompter() {
    scanner = new Scanner(System.in);
  }
  
  public String promptItemName() {
    System.out.println("What type of item should fill the jar? ");
    String itemInput =  scanner.nextLine();
    return itemInput;
  }
  
  public int promptMaxItemNumber(String itemName) {
    System.out.printf("What is the maximum amount of %s? %n", 
                     itemName);
    String amountInput = scanner.nextLine();
    return Integer.parseInt(amountInput);
  }
  
  public int promptGuess(String itemName, int maxItemNumber) {
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d.%n", 
                      itemName, 
                      maxItemNumber);
    String playerGuessInput = scanner.nextLine();
    return Integer.parseInt(playerGuessInput);
  }
  
  public void promptLowGuess(int guess, int maxItemNumber){
    System.out.println("Your guess is too low, please try again with a higher number.");
  }
  
  public void promptHighGuess(int guess, int maxItemNumber){
    System.out.println("Your guess is too high, please try again with a lower number.");
  }
  
  public void promptWinner(int counter) {
    System.out.printf("Congratulations!!!! You got it in %d attempts%n", 
                      counter);
  }
  
    //Warn user if user is guessing over the max number of items.
  public void  promptOverMaximumGuess(int guess, int maxItemNumber) {
    System.out.println("Your guess must be less than maximum fill amount");
  }
  
}