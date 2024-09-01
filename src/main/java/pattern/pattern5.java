package pattern;

import java.util.Scanner;

public class pattern5 {
    public static void nTriangle(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nTriangle(n);
    }
}
