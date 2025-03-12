package src;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String reverseName = new StringBuilder(name).reverse().toString(); -- use this code if you want a built-in reverse name

        // the variable that the name will be stored f it is reversed.
        String reverseName = "";

        System.out.println("Welcome to Palindrome Work Checker");

        while (true) {
            // asking the user to input a word
            System.out.print("Please Enter a Word: ");
            String name = scanner.nextLine();
            //   I did -1 here because the length is no the same reading or count as the index.
            for (int i = name.length() - 1; i >= 0; --i) { // the code block will loop until the index reaches 0 and also it is decremental
                reverseName = reverseName + name.charAt(i); // I will store it in the reverseName variable of the current value of reversename concatenate the characters of the name
            }
            // will print the reversed name
            System.out.println("Reversed Name: " + reverseName);

            // will check first if the reversed name is equal to the name
            if (reverseName.toLowerCase().equals(name)) {
                // will print palindrome if it is equal
                System.out.println("The word " + reverseName + " is a Palindrome!");
            } else {
                // will print if it isn't
                System.out.println("The word " + reverseName + " is not a Palindrome!");
            }
            while (true) {
                // an exiting statement if the user wants to quit or try again
                System.out.print("\nDo you still wish to continue(y/n)?");
                String continueProgram = scanner.nextLine();
                // if no, it will return or stop the program
                if (continueProgram.equals("n")) {
                    return;
                } else if (!continueProgram.equals("y")) {
                    // if the input is aside from y, it will invalidate and loop again the question
                    System.out.println("Your Input is Invalid. Please Try Again!");
                } else {
                    // will reset the reversed name so that if the user tries again, the word will not stack
                    reverseName = "";
                    // uses break to break the loop and start again
                    break;
                }
            }
        }
    }
}
