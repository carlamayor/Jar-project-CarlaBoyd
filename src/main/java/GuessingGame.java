public class GuessingGame {
    public static void main(String[] args) {
      
      
      //Create prompter to implement prompter instances to retrieve values.
      Prompter prompter = new Prompter();
      String itemName = prompter.promptItemName();
      int maxItemNumber = prompter.promptMaxItemNumber(itemName);
      
      //Create a jar instance/object implementing prompter values.
      Jar jar = new Jar(itemName, maxItemNumber);
      
      //Generate and fill the jar with a random number <= maxItemNumber.
      jar.fill();
      
      //Create a Game Loop.
      int counter = 0;
      int currentNumber = jar.getCurrentNumber();
      int guess;
      boolean isGuessCorrect = false;
      
      while (!isGuessCorrect) {
        guess = prompter.promptGuess(itemName, maxItemNumber);
        counter++;
        
        if (guess == currentNumber) {
          isGuessCorrect = true;
        } else if (guess > maxItemNumber) {
          prompter.promptOverMaximumGuess(guess, maxItemNumber);
          counter--;
        }else if (guess > currentNumber) {
          prompter.promptHighGuess(guess, maxItemNumber);
        } else if (guess < currentNumber) {
          prompter.promptLowGuess(guess, maxItemNumber);
        }
        
      }
      prompter.promptWinner(counter);
      
      }
      

    }

