package pattern;

import java.util.Scanner;

public class pattern13 {
    public static void nTriangle(int n) {
        int num=1;
        for (int i = 0; i <n; i++){
            for (int j = 0; j <=i; j++) {
                System.out.print(num+" ");
                num++;
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
