package pattern;

import java.util.Scanner;

public class pattern20{
    public static void nTriangle(int n) {
        /*int s=2*n-2;
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
        s=2;
        for (int i = 1; i <n; i++){
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
        }*/
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<n) space-=2;
            else space+=2;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nTriangle(n);
    }


}
