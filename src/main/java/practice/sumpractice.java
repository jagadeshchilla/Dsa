package practice;

import java.util.Scanner;

public class sumpractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0;
        int even=0;

        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                even+=digit;
            }
            else {
                odd+=digit;
            }
            n=n/10;
        }
        System.out.println(even+" "+odd);
    }
}
