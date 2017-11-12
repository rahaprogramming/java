/***************************************************************************
 * @author Ralph Harris
 * CSS 346 Intro To Java - for Mrs. Lindy :)
 * 
* Assignment Choice 2 - Guess the Number
* 
* This is an application that plays "guess the number".  
* It chooses the number to be guessed by selecting a random integer 
* in the range 1 to 1000.  The application displays the prompt "Guess a number
* between 1 and 1000."   The player inputs a first guess.  If the player's 
* guess is incorrect, the program displays "Too high.  Try again."  
* Or "Too low.  Try again."  to help the player zero in on the correct answer.
* The program then prompts the user for the next guess.  When the user enters
* the correct answer, it display "Congratulations, you guessed the number!", and
* allows the user to choose whether to play again.
 **************************************************************************/
package numberguess;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        
        String play = "yes"; // variable to offer "play again" option
        
        do // do while the variable "play" is "yes" or "YES"
        {
            
        Random rand = new Random(); // initialize random number
        Scanner input = new Scanner(System.in); // initialize scanner
        
        int  theNumber = rand.nextInt(1000) + 1; // our random number variable (the secret number)
        int userGuess;// the variable for the user's guess
        
        //Below is our welcome message followed by the prompt for the users guess
        System.out.println("Hello. Welcome to the Java guessing game! \n"
                + "I'll guess a number between 1-1000 and you try to guess it "
                + "in as few guesses as possible. \n"
                + "Pick a number between 1-1000: ");
        userGuess = input.nextInt();// user's guess
        
        //The following do... while statement runs while the user has
        //not guessed the correct number. 
        do
        {
            //If the user does not guess right, they will get the clue "too low"
            //or "too high" and a prompt for a new guess.
            if(userGuess < theNumber)// if too low
            {
                System.out.println("That Number Is Too Low. Guess again: ");
                userGuess = input.nextInt();// user's guess
            }else if(userGuess > theNumber)// else.. if too high
            {
                System.out.println("That Number Is Too High. Guess again: ");
                userGuess = input.nextInt();// user's guess
            }
         // run "do".. while userGuess(the users guess) doesn't equal theNumber
         // (the secret number)
        }while(userGuess != theNumber);
        
        //Below is the success message which runs if the userGuess (the user's guess)
        //equals theNumber (the secret number). It then asks if the player would
        //like to play again.
      if(userGuess == theNumber)
      {
          System.out.println("Congratulations, you guessed the number!"
                  + " Your psychic skills are improving!! \nWould you like "
                  + "to play again? (enter yes or no): ");
          input.nextLine();// clear line(error fix)
          play = input.nextLine(); // play again?
      }
        // run while the player inputs "yes" to "play again?"
        }while(play.equals("yes") || play.equals("YES"));
    
        //Displays a thank you message on exit
        if(play.equals("no") || play.equals("NO"))
        {
            System.out.println("Thank you for playing! Have a nice day.");
        }
    }
}
