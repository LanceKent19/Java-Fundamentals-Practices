package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
    public static void simpleCalculatorStart(Scanner scanner) {
        int answer = 0;

        // Put a throw Exception if the user inputted a wrong input, it will request to input again by the user.
        try {
            while (true) {
                System.out.print("Please Enter your First Number: ");
                int num1 = scanner.nextInt();
                System.out.print("Please Enter your Second Number: ");
                int num2 = scanner.nextInt();

                // Choosing of what operator should the program use
                System.out.print("Please Choose your Operator( + , - , / , * ): ");
                String operator = scanner.next();

                // A condition statement where it will base on the operator, and it will provide the formula
                switch (operator) {
                    case "+": // Addition
                        answer = num1 + num2;
                        break;
                    case "-": // Subtraction
                        answer = num1 - num2;
                        break;
                    case "/": // Division
                        answer = num1 / num2;
                        break;
                    case "*": // Multiplication
                        answer = num1 * num2;
                        break;
                    default:
                        System.out.println("Invalid Input.");
                        break;
                }
                // Will print the answer
                System.out.println("\nThe Answer with your operator " + operator + " is " + answer);

                while (true) {
                    System.out.print("\nDo you still want to calculate(y/n)? ");
                    String continueProgram = scanner.next();

                    if (continueProgram.equals("n")) {
                        System.out.println("Going back to the Main Menu.....");
                        return;
                    }else if(!continueProgram.equals("y")){
                        System.out.println("Invalid Input. Please Try Again!!");
                    }else {
                        break;
                    }
                }
            }
        }catch (InputMismatchException e){
            throw new InputMismatchException("Invalid Input. Please Try Again!!!");
        }

    }
}
