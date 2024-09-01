package practice;

import java.util.Scanner;

class ComplexNumbers {
    private int real;
    private int imaginary;

    // Constructor to initialize the complex number
    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Function to add two complex numbers
    public void plus(ComplexNumbers c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    // Function to multiply two complex numbers
    public void multiply(ComplexNumbers c) {
        int realPart = this.real * c.real - this.imaginary * c.imaginary;
        int imaginaryPart = this.real * c.imaginary + this.imaginary * c.real;
        this.real = realPart;
        this.imaginary = imaginaryPart;
    }

    // Function to print the complex number in the required format
    public void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }
}

class complex {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Read input for the first complex number
        int real1 = scanner.nextInt();
        int imaginary1 = scanner.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);

        // Read input for the second complex number
        int real2 = scanner.nextInt();
        int imaginary2 = scanner.nextInt();
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        // Read the operation type
        int operation = scanner.nextInt();

        // Perform the operation based on the input
        if (operation == 1) {
            c1.plus(c2);
        } else if (operation == 2) {
            c1.multiply(c2);
        }
        else{
            return;
        }
        // Print the result
        c1.print();

        scanner.close();
    }
}
