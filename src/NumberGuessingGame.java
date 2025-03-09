package src;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // I initialize first the userNumber variable after all, it is not guaranteed that it will have a value
        int userNumber = 0;
        // imported java libraries
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            // the random number generator using Random Class
            int computerNumber = random.nextInt(100);
            // I use do while loop so It will print first the guess number even if the inputted first was correct or not
            do {
                System.out.print("Guess a Number between 1 to 100: ");
                userNumber = scanner.nextInt();

                // this will print if the guessed of the user is correct
                if (userNumber == computerNumber) {
                    System.out.println("\nYour Guess is Right!! It is " + computerNumber);
                } else if (userNumber < computerNumber) {
                    // will print if the guess of the user is too low
                    System.out.println("Too Low. Please Try Again.");
                } else {
                    // will print if the guess of the user is too high
                    System.out.println("Too High. Please Try Again.");
                }

            } while (computerNumber != userNumber); // the condition that the loop will not break unless the computer number will be equal to the users input
            // will ask if the user wish to continue
            while (true) {
                System.out.print("\nDo you still want to continue(y/n)?");
                String continueProgram = scanner.next();
                // if n or no, it will go to the return statement or will exit the program if it is in the main method
                if (continueProgram.equals("n")) {
                    return;
                } else if (!continueProgram.equals("y")) {
                    // will just loop of asking if the user wish to continue if the input is neither of the choices
                    System.out.println(continueProgram + " is an invalid input. Please Try Again.");
                } else {
                    // will break the loop if the input is y, and will go back to the main menu or program
                    break;
                }
            }
        }
    }
}
