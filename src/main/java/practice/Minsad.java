package practice;

import java.util.Scanner;

public class Minsad {
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;  // Initialize the minimum to a large value
        for (int num : nums) {
            int digitSum = sumOfDigits(num);  // Compute the sum of digits for each number
            if (digitSum < mini) {
                mini = digitSum;  // Update the minimum if the current sum is smaller
            }
        }
        return mini;  // Return the minimum digit sum
    }

    // Helper function to compute the sum of digits of a number
    public int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // Add the last digit
            num /= 10;  // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input array length
        System.out.println("Enter the length of the array:");
        int n = scanner.nextInt();

        // Read the input array
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the solution and output the result
        Minsad solution = new Minsad();
        int result = solution.minElement(nums);

        // Print the result
        System.out.println("Minimum element after replacements: " + result);
    }
}
