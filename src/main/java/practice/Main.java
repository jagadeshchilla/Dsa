package practice;

import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();

        for (int currentFahrenhietValue = start; currentFahrenhietValue <= end; currentFahrenhietValue += step) {
            int celsiusValue = (int)((5.0 / 9) * (currentFahrenhietValue - 32));
            System.out.println(currentFahrenhietValue + "\t" + celsiusValue);
        }

    }
}