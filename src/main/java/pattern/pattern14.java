package pattern;

import java.util.Scanner;

public class pattern14 {
    public static void nTriangle(int n) {

        for (int i = 0; i <n; i++){
            for (char j = 'A'; j <='A'+i; j++) {
                System.out.print(j+" ");
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
