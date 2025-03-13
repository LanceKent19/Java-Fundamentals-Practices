import java.util.Random;
import java.util.Scanner;
import src.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Java Fundamentals System - A system for practicing your fundamentals by creating simple yet entertaining project!");
        System.out.println("These are currently the system that has been developed: ");
        while (true) {
            System.out.println("[1] Odd or Even");
            System.out.println("[2] Simple Calculator");
            System.out.println("[3] Operation Table");
            System.out.println("[4] Largest Number Array");
            System.out.println("[5] Number Guessing Game");
            System.out.println("[6] Palindrome Checker");
            System.out.println("[7] Rock Paper Scissor Game!!");
            System.out.println("[8] Exit");
            System.out.print("\nPlease choose your System: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    OddOrEven.oddOrEvenStart(scanner);
                    break;
                case 2:
                    SimpleCalculator.simpleCalculatorStart(scanner);
                    break;
                case 3:
                    OperationTable.operationTableStart(scanner);
                    break;
                case 4:
                    LargestNumberArray.largestNumberArrayStart(scanner);
                    break;
                case 5:
                    NumberGuessingGame.numberGuessingGame(scanner, random);
                    break;
                case 6:
                    Palindrome.palindromeStart(scanner);
                    break;
                case 7:
                    RockPaperScissor.rockPaperScissorStart(scanner, random);
                    break;
                case 8:
                    System.out.println("Thank you for using our System. Goodbye!!");
                    return;
                default:
                    System.out.println("Invalid Input. Please Try Again!!");
            }
        }
    }
}
