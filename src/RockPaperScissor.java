package src;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void rockPaperScissorStart(Scanner scanner, Random random) {
        String playerMove = "";
        int playersScore=0;
        int computersScore=0;
        // moves in rock paper scissor
        String[] moves = {"r","p","s"};

        // will generate random move based on the value inside the moves Array
        String computerMove = moves[random.nextInt(moves.length)];
        // will enter the users move
        while (true) {
                System.out.print("Enter your Move(r/p/s) ");
                playerMove = scanner.next().trim();

                // condition if the player's move is the same as the computer's move
            if (computerMove.equals(playerMove)) {
                System.out.println("The Computer choose " + computerMove);
                System.out.println("The Game was a Tie!!");
                // condition if  the player's move is rock and the computer is scissors
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("s")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You won.");
                    playersScore++;
                    // condition if the computer's move is paper
                } else if (computerMove.equals("p")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You Lose.");
                    computersScore++;
                }
                // condition if the player's move is paper and if the computer's scissor
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You Lose.");
                    computersScore++;
                    // condition if the computer's move is rock
                } else if (computerMove.equals("r")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You Won.");
                    playersScore++;
                }
                // condition if the player's move is scissor and the computer is paper
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You won.");
                    playersScore++;
                    // else if the computer's move is rck
                } else if (computerMove.equals("r")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You Lose.");
                    computersScore++;
                }
            } else {
                // if the user inputted neither r, p,s ; it will invalidate it and ask again for a move using the continue statement
                System.out.println("Invalid Input. Please Try Again. ");
                continue; // will ignore the code below and will go back to the start or loop
            }
            System.out.println("\nSCORE ===== Player: "+playersScore+" Computer: "+computersScore);
            // will ask the user if he/she wants to continue or try again
                while (true) {
                    System.out.print("\nDo you still wish to continue(y/n) ");
                    String continueProgram = scanner.next();
                    // will exit the program
                    if (continueProgram.equals("n")) {
                        System.out.println("Going back to the Main Menu.....");
                        return; // exit the program if it is in the main method
                    }else if (!continueProgram.equals("y")){
                        // if it is not y or yes, will invalidate and ask again the user for input, loop again
                        System.out.println("Invalid Input. Please Try Again.");
                    }else {
                        // will break the loop and go back to the start or first iteration
                        break;
                    }
                }
        }
    }
}
