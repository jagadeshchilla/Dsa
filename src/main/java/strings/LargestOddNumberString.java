package strings;

import java.util.Scanner;

public class LargestOddNumberString {
    public String largestOddNumber(String num) {
        // Traverse the string from the last character to the first
        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current character is an odd number
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                // Return the substring from the start to the current character (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // If no odd number is found, return an empty string
        return "";
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        // Create an instance of Solution and find the largest odd number
        LargestOddNumberString solution = new LargestOddNumberString();
        String result = solution.largestOddNumber(num);

        // Print the result
        System.out.println("Largest odd number substring: " + result);
    }
}
