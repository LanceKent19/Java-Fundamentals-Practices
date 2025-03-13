    package src;

    import java.util.Scanner;

    public class OperationTable {
        public static void operationTableStart(Scanner scanner) {
            // need to Initialize after all, the program doesn't guarantee if there is a value in answer
            int answer = 0;
            while (true) {
                // Asking the user to input, what operation and the max range of the operation tables.
                System.out.print("Please Enter a Number: ");
                int num = scanner.nextInt();
                System.out.print("Please Enter an Operator( +, -, /, *): ");
                String operator = scanner.next();
                System.out.print("Please Enter the Max Range: ");
                int maxRange = scanner.nextInt();
                // The for loop that will iterate the statement based on certain conditions
                for (int i = 1; i <= maxRange; i++) {
                    switch (operator){
                        case "+": // Addition
                            answer = num + i;
                            break;
                        case "-": // Subtraction
                            answer = num - i;
                            break;
                        case "*": // Multiplication
                            answer = num * i;
                            break;
                        case "/": // Division
                            answer = num / i;
                            break;
                        default: // If the operator is Invalid or not an operator symbol
                            System.out.println(operator + " is invalid. Please Try Again.");
                            break;
                    }
                    // This will print the result of the program
                    System.out.println(num + " " + operator + " " + i + " = " + answer);
                }
                // Will ask the user if he/she wants to continue the program, will print again if the user type neither n or y
                while (true) {
                    System.out.print("\nDo you still want to continue(y/n)? ");
                    String continueProgram = scanner.next();

                    if (continueProgram.equals("n")) {
                        System.out.println("Going back to the Main Menu.....");
                        return;
                    } else if (!continueProgram.equals("y")) {
                        // will loop again
                        System.out.println("Your Input is Invalid. Please Try Again!!");
                    }else {
                        // break the loop and will go back to the main program
                        break;
                    }
                }
            }
        }
    }
