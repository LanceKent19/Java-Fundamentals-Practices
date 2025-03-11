package src;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playerMove = "";
        String[] moves = {"r","p","s"};

        String computerMove = moves[random.nextInt(moves.length)];
        while (true) {
                System.out.print("Enter your Move(r/p/s) ");
                playerMove = scanner.nextLine();

            if (computerMove.equals(playerMove)) {
                System.out.println("The Computer choose " + computerMove);
                System.out.println("The Game was a Tie!!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("s")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You won.");
                } else if (computerMove.equals("p")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You Lose.");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You Lose.");
                } else if (computerMove.equals("r")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You Won.");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You won.");
                } else if (computerMove.equals("r")) {
                    System.out.println("The Computer choose " + computerMove);
                    System.out.println("You Lose.");
                }
            } else {
                System.out.println("Invalid Input. Please Try Again. ");
            }

                while (true) {
                    System.out.print("Do you still wish to continue(y/n) ");
                    String continueProgram = scanner.next();

                    if (continueProgram.equals("n")) {
                        return;
                    }else if (!continueProgram.equals("y")){
                        System.out.println("Invalid Input. Please Try Again.");
                    }else {
                        break;
                    }
                }
        }
    }
}
