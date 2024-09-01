package pattern;

import java.util.Scanner;

public class pattern8{
    public static void nTriangle(int n) {
        for (int i = 0; i <n; i++){
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
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
