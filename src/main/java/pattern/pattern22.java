package pattern;

import java.util.Scanner;

public class pattern22 {
    public static void nTriangle(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                int res=n-(Math.min(Math.min(top,bottom),Math.min(left,right)));
                System.out.print(res);
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
