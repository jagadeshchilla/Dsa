package hashing;

import java.util.Scanner;

public class LowFrequency {
    public static void frequencyCount(int arr[], int n, int p) {
        // Initialize count to 0
        int cnt = 0;
        // Count the occurrences of the number p in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == p) {
                cnt++;
            }
        }
        // Print the count
        System.out.println(cnt);
    }

    public static void main(String args[]) {
        // Initialize the array
        int arr[] = {2, 3, 2, 3, 5};
        int n = arr.length;
        int q;
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);
        // Read the number of queries
        q = sc.nextInt();
        // Process each query
        while (q-- != 0) {
            int number;
            // Read the number to be searched
            number = sc.nextInt();
            // Call the frequencyCount method
            frequencyCount(arr, n, number);
        }
        sc.close(); // Close the scanner
    }
}
