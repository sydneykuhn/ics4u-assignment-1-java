/*
*  The program plays rock, paper, scissors
*    with user input.
*
* @author  Sydney
* @version 1.0
* @since   2022-9-19
*/

import java.io.Console;

/**
* This program plays rock, paper, scissors.
*/
final class RockPaperScissors {
    /**
     * Set constant rock.
     */
    private static final int ROCK = 1;

    /**
     * Set constant paper.
     */
    private static final int PAPER = 2;

    /**
     * Set constant scissor.
     */
    private static final int SCISSOR = 3;

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Get user input
        final Console console = System.console();
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Rock (1)\nPaper (2)\nScissors (3)");
        final String userInputString = console.readLine(
            "Enter a number 1, 2 or 3 to chose : ");

	int userInput = 0;

        try {
	    userInput = Integer.valueOf(userInputString);
        } catch(Exception e) {
	    System.out.println("\nInvalid Input Entered\nDone.");
	    System.exit(0);
	}

        // Get random int
        final int min = 1;
        final int max = 3;
        final int randomInt = (int) (Math.random() * max + min);

        // If statements
        if (userInput == randomInt) {
            System.out.println("You tied!");
        } else if (userInput == ROCK & randomInt == PAPER) {
            System.out.println("You lose!");
        } else if (userInput == ROCK & randomInt == SCISSOR) {
            System.out.println("You win!");
        } else if (userInput == PAPER & randomInt == ROCK) {
            System.out.println("You win!");
        } else if (userInput == PAPER & randomInt == SCISSOR) {
            System.out.println("You lose!");
        } else if (userInput == SCISSOR & randomInt == ROCK) {
            System.out.println("You lose!");
        } else if (userInput == SCISSOR & randomInt == PAPER) {
            System.out.println("You win!");
        } else {
	    System.out.println("Error Occurred Please Try Again.");
	}

	// Show user what the computer chose
	if (randomInt == ROCK) {
	    System.out.println("\nThe computer chose rock.");
	} else if (randomInt == PAPER) {
	    System.out.println("\nThe computer chose paper.");
	} else if (randomInt == SCISSOR) {
	    System.out.println("\nThe computer chose scissors.");
	} else {
	    System.out.println("\nError Occurred Please Try Again.");
	}
       System.out.println("\nDone.");
  }
}
