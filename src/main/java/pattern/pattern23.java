package pattern;

import java.util.Scanner;



public class pattern23 {
    public static void nTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i || j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
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
