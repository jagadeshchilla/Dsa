package pattern;

import java.util.Scanner;

public class pattern10 {
    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nForest(n);
    }
}
