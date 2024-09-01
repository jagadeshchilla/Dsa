package pattern;

import java.util.Scanner;

public class pattern17{
    public static void nTriangle(int n) {
        for(int i=0;i<n;i++){

            // for printing the spaces.
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            // for printing the characters.
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){

                System.out.print(ch+" ");
                if(j <= breakpoint) ch++;
                else ch--;
            }

            // for printing the spaces again.
            for(int j=0;j<n-i-1;j++){
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
