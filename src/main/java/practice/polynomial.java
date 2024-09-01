package practice;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Polynomial {
    int[] coef;

    // Default constructor
    public Polynomial() {
        coef = new int[5];
    }

    // Parameterized constructor
    public Polynomial(int coefficient, int degree) {
        coef = new int[Math.max(degree + 1, 5)];
        coef[degree] = coefficient;
    }

    // Copy constructor
    public Polynomial(Polynomial p) {
        this.coef = Arrays.copyOf(p.coef, p.coef.length);
    }

    // Set coefficient for a particular degree
    public void setCoefficient(int degree, int coefficient) {
        if (degree >= coef.length) {
            coef = Arrays.copyOf(coef, degree + 1);
        }
        coef[degree] = coefficient;
    }

    // Overload "+" operator
    public Polynomial plus(Polynomial p) {
        Polynomial result = new Polynomial();
        int max = Math.max(this.coef.length, p.coef.length);
        result.coef = new int[max];

        for (int i = 0; i < max; i++) {
            int thisCoef = (i < this.coef.length) ? this.coef[i] : 0;
            int pCoef = (i < p.coef.length) ? p.coef[i] : 0;
            result.coef[i] = thisCoef + pCoef;
        }
        return result;
    }

    // Overload "-" operator
    public Polynomial minus(Polynomial p) {
        Polynomial result = new Polynomial();
        int max = Math.max(this.coef.length, p.coef.length);
        result.coef = new int[max];

        for (int i = 0; i < max; i++) {
            int thisCoef = (i < this.coef.length) ? this.coef[i] : 0;
            int pCoef = (i < p.coef.length) ? p.coef[i] : 0;
            result.coef[i] = thisCoef - pCoef;
        }
        return result;
    }

    // Overload "*" operator
    public Polynomial times(Polynomial p) {
        Polynomial result = new Polynomial();
        int max = this.coef.length + p.coef.length - 1;
        result.coef = new int[max];

        for (int i = 0; i < this.coef.length; i++) {
            for (int j = 0; j < p.coef.length; j++) {
                result.coef[i + j] += this.coef[i] * p.coef[j];
            }
        }
        return result;
    }

    // Copy assignment operator
    public Polynomial copy() {
        return new Polynomial(this);
    }

    // Print polynomial
    public void print() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (int i = 0; i < coef.length; i++) {
            if (coef[i] != 0) {
                if (!first) {
                    sb.append(" ");
                }
                sb.append(coef[i]).append("x").append(i);
                first = false;
            }
        }
        if (sb.length() == 0) {
            sb.append("0x0");
        }
        System.out.println(sb.toString());
    }
}

public class polynomial {
    // test client
    public static void main(String[] args) throws IOException {
        int count1, count2, choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        count1 = Integer.parseInt(br.readLine().trim());
        int[] degree1 = new int[count1];
        int[] coeff1 = new int[count1];

        String[] nm = br.readLine().split(" ");
        for (int i = 0; i < count1; i++) {
            degree1[i] = Integer.parseInt(nm[i]);
        }

        nm = br.readLine().split(" ");
        for (int i = 0; i < count1; i++) {
            coeff1[i] = Integer.parseInt(nm[i]);
        }

        Polynomial first = new Polynomial();
        for (int i = 0; i < count1; i++) {
            first.setCoefficient(degree1[i], coeff1[i]);
        }

        count2 = Integer.parseInt(br.readLine().trim());
        int[] degree2 = new int[count2];
        int[] coeff2 = new int[count2];

        nm = br.readLine().split(" ");
        for (int i = 0; i < count2; i++) {
            degree2[i] = Integer.parseInt(nm[i]);
        }

        nm = br.readLine().split(" ");
        for (int i = 0; i < count2; i++) {
            coeff2[i] = Integer.parseInt(nm[i]);
        }

        Polynomial second = new Polynomial();
        for (int i = 0; i < count2; i++) {
            second.setCoefficient(degree2[i], coeff2[i]);
        }

        choice = Integer.parseInt(br.readLine().trim());

        Polynomial result;
        switch (choice) {
            // Add
            case 1:
                result = first.plus(second);
                result.print();
                break;
            // Subtract
            case 2:
                result = first.minus(second);
                result.print();
                break;
            // Multiply
            case 3:
                result = first.times(second);
                result.print();
                break;
            case 4: // Copy constructor
                Polynomial third = new Polynomial(first);
                if (third.coef == first.coef) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
                break;
            case 5: // Copy assignment operator
                Polynomial fourth = new Polynomial(first);
                if (fourth.coef == first.coef) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
