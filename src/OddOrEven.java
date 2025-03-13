package src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    public static void oddOrEvenStart(Scanner scanner) {
        String resumeProgram = "";
        // I put try and catch with an InputMismatchException.
        // So that if the user inputted a wrong value, it will display an Error Exception and Request to Run Again!
        try {
        while(true) {
            System.out.print("Please Enter a Number: ");
            int num = scanner.nextInt();

            // if the user put a number that the remainder is equal to 0, it is even, else it is odd
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is an Even Number");
                } else if (num % 2 == 1) {
                    System.out.println("The number " + num + " is an Odd Number");
                }
            // While print again if the user does type any characters aside n or y
            while (true) {
                System.out.print("\nDo you still want to continue(y/n)?");
                resumeProgram = scanner.next();

                if (resumeProgram.equals("n")) {
                    System.out.println("Going back to the Main Menu.....");
                    return;
                } else if (!resumeProgram.equals("y")) {
                    // Asking again the user if he/she wants to run again the Program
                    System.out.println("Your Input was Invalid. Please Try Again!!");
                }else{
                    break;
                }
            }
            }
        } catch (InputMismatchException e) {
            // throwing new Exception with a statement
            throw new InputMismatchException("Wrong Input. Please Run Again!!");
        }
    }
}
