package src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resumeProgram = "";

        try {
        while(true) {
            System.out.print("Please Enter a Number: ");
            int num = scanner.nextInt();

                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is an Even Number");
                } else if (num % 2 == 1) {
                    System.out.println("The number " + num + " is an Odd Number");
                }
                    programContinue(resumeProgram, scanner);
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Wrong Input. Please Run Again!!");
        }

    }
    
    public static void programContinue(String resumeProgram, Scanner scanner){
        while (true) {
            System.out.print("\nDo you still want to continue(y/n)?");
             resumeProgram = scanner.next();

            if (resumeProgram.equals("n")) {
                System.out.println("Thank you for using the Odd or Even Program. Good bye!!");
                System.exit(0);
            } else if (!resumeProgram.equals("y")) {
                System.out.println("Your Input was Invalid. Please Try Again!!");
            }else{
                return;
            }
        }
    }
}
