package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        try {
            while (true) {
                System.out.print("Please Enter your First Number: ");
                int num1 = scanner.nextInt();
                System.out.print("Please Enter your Second Number: ");
                int num2 = scanner.nextInt();

                System.out.print("Please Choose your Operator( + , - , / , * ): ");
                String operator = scanner.next();

                switch (operator) {
                    case "+":
                        answer = num1 + num2;
                        break;
                    case "-":
                        answer = num1 - num2;
                        break;
                    case "/":
                        answer = num1 / num2;
                        break;
                    case "*":
                        answer = num1 * num2;
                        break;
                }
                System.out.println("\nThe Answer with your operator " + operator + " is " + answer);

                while (true) {
                    System.out.print("\nDo you still want to calculate(y/n)? ");
                    String continueProgram = scanner.next();

                    if (continueProgram.equals("n")) {
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
