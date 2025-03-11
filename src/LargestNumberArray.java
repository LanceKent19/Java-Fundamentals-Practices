package src;
import java.util.Scanner;

public class LargestNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a variable that will count the attempts of the array numbers
        int count =0;

        while (true) {
            // requesting a number of elements that will be stored in an Array
            System.out.print("Enter how many number will be stored in an Array: ");
            int inputNumber = scanner.nextInt();

            //  the length of the numSet Array will be based on the inputNumber of the User
            int[] numSet = new int[inputNumber];

            // looping based on the user input and - 1 after all it will read the 0 which is +1 in the length
            for (int index = 0; index <= inputNumber - 1; index++) {
                count++; // Counting
                System.out.print("Enter " + count + " Number: "); // will keep asking the user until it reached the inputNumber
                if (scanner.hasNextInt()) { // check if the input of the user is an integer
                    numSet[index] = scanner.nextInt(); // if yes, the integer will be stored in the numSet Array based on the number of index
                } else { // if not integer, the return will be false, the 0 will be value and will continue the program
                    System.out.println("Invalid Input. The value will be 0.");
                    scanner.next();
                }
            }
            // will print all the numbers that has been stored in the numSet came from the users input
            System.out.print("The Elements of the Array are ");
            for (int i = 0; i <= inputNumber - 1; i++) {
                System.out.print(numSet[i] + " ");
            }
            // assume the large and least is in the index 0 of the Array
            int initialLarge = numSet[0];
            int initialLeast = numSet[0];

            // a loop that will compare all the indexes and update the values until the condition is satisfied
            for (int i = 0; i < numSet.length; i++) {
                if (initialLarge < numSet[i]) {  // if the initial large is less, then the numset will become the value of intial
                    initialLarge = numSet[i];
                }
                if (initialLeast > numSet[i])  // if the initial large is greater than, then the numset will become the value of intial
                    initialLeast = numSet[i];
            }
            // will print the largest and least number in the sets of numbers
            System.out.println("\n\nThe Largest Number in the Array is " + initialLarge);
            System.out.println("The Least Number in the Array is " + initialLeast);

            while (true) {
                System.out.print("\nDo you still want to continue(y/n)? ");
                String continueProgram = scanner.next();

                if (continueProgram.equals("n")) {
                    return;
                }else if (!continueProgram.equals("y")){
                    System.out.println("Invalid Input. Please Try Again");
                }else {
                    break;
                }
            }
        }

    }
}
