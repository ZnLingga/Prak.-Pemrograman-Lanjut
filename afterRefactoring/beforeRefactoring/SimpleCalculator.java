package Tugas4.afterRefactoring.beforeRefactoring;

import java.util.Scanner;

public class SimpleCalculator {

    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        // Input dua angka
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // Pilih operasi
        System.out.println("Choose operation: (+, -, *, /)");
        char operation = scanner.next().charAt(0);

        // Operasi berdasarkan input
        if (operation == '+') {
            int result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operation == '-') {
            int result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operation == '*') {
            int result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operation == '/') {
            if (num2 != 0) {
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operation.");
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.calculate();
    }
}

