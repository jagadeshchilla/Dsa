package pattern;

import java.util.Scanner;

public class pattern11 {
    public static void nForest(int n) {

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                int first=1;
                if (i==j){

                    System.out.print(first+" ");
                }
                if (i!=j){
                    if (i%2==0 && j%2==1 || i%2==1 && j%2==0) {
                        first = 0;
                        System.out.print(first+" ");
                    }
                    if (i%2==0 && j%2==0 || i%2==1 && j%2==1){
                        first=1;
                        System.out.print(first+" ");
                    }
                }
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
