package practice;

import java.util.*;

public class divisors {
    public static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        // Iterate over all numbers from 1 to sqrt(N)
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);  // i is a divisor

                // If i is not sqrt(N), then n/i is also a divisor
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        // Sort divisors in ascending order
        Collections.sort(divisors);

        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading multiple lines of input until end-of-file (EOF)
        while (scanner.hasNext()) {
            int N = scanner.nextInt();

            // Print the integer N itself
            System.out.println(N);

            // Find and print the divisors of N
            List<Integer> divisors = findDivisors(N);
            for (int divisor : divisors) {
                System.out.println(divisor);
            }
        }

        scanner.close();
    }
}
