package pattern;

import java.util.Scanner;

public class pattern19{
    public static void nTriangle(int n) {
        int s=0;
        for (int i = 0; i <n; i++){
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            s+=2;
            System.out.println();
        }
        s=2*n-2;
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            s-=2;
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nTriangle(n);
    }


}
