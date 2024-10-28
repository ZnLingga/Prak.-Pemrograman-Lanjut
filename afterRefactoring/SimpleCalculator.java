package Tugas4.afterRefactoring;

import java.util.Scanner;

public class SimpleCalculator {

    // konstanta dibawah ini digunakan untuk menggantikan plus minus bagi dan kali dengan variabel untuk magic number digunakan dibawah
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    public void calculate() {
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");
        char operation = getOperation();
        int result = performOperation(num1, num2, operation);
        displayResult(result);
    }


    private int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }

    private char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation: (+, -, *, /)");
        return scanner.next().charAt(0);
    }

    // Extract Method: Melakukan operasi
    private int performOperation(int num1, int num2, char operation) {
        // Replace Magic Number with Symbolic Constant
        if (operation == ADDITION) {
            return num1 + num2;
        } else if (operation == SUBTRACTION) {
            return num1 - num2;
        } else if (operation == MULTIPLICATION) {
            return num1 * num2;
        } else if (operation == DIVISION) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Cannot divide by zero.");
                return 0;
            }
        } else {
            System.out.println("Invalid operation.");
            return 0;
        }
    }

    // Extract Method: Menampilkan hasil
    private void displayResult(int result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Tugas4.afterRefactoring.beforeRefactoring.SimpleCalculator calculator = new Tugas4.afterRefactoring.beforeRefactoring.SimpleCalculator();
        calculator.calculate();
    }
}


