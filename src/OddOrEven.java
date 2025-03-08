package src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resumeProgram = "";
        // I put try and catch with an InputMismatchException.
        // So that if the user inputed a wrong value, it will display an Error Exception and Request to Run Again!
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
                    programContinue(resumeProgram, scanner);
            }
        } catch (InputMismatchException e) {
            // throwing new Exception with a statement
            throw new InputMismatchException("Wrong Input. Please Run Again!!");
        }

    }
    // I separate this method so that it will show more if the user wants to continue
    public static void programContinue(String resumeProgram, Scanner scanner){
        // While print again if the user does type any characters aside n or y
        while (true) {
            System.out.print("\nDo you still want to continue(y/n)?");
             resumeProgram = scanner.next();

            if (resumeProgram.equals("n")) {
                // will stop the program if the user input y or yes
                System.out.println("Thank you for using the Odd or Even Program. Good bye!!");
                System.exit(0);
            } else if (!resumeProgram.equals("y")) {
                // Asking again the user if he/she wants to run again the Program
                System.out.println("Your Input was Invalid. Please Try Again!!");
            }else{
                // return or loop again the program
                return;
            }
        }
    }
}
