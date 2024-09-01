package practice;

import java.util.Scanner;

class CountPrime {
    public static  boolean isprime(int n){
        if(n<=1) return false;
        if(n==2||n==3) return true;
        if(n%2==0 || n%3==0) return false;

        int sqrt=(int) Math.sqrt(n);
        for(int i=5;i<=sqrt;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    // Write your totalPrime function here
    public static int totalPrime(int s,int e){
        int cnt=0;
        for(int i=s;i<=e;i++){
            if (isprime(i)){
                cnt++;
            }
        }
        return cnt;
    }
}

public class primecount{
    public static void main(String args[]) {

        CountPrime obj = new CountPrime();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(obj.totalPrime(s, e));
    }
}


