package practice;
import java.util.* ;

public class binary {
    public static int countSetBits(int n) {

        int count=0;
        while(n>0){
            count+=n & 1;

            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println(countSetBits(a));
    }
}