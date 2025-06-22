package core_java.control_statements.assignment;

import java.util.Scanner;

// Create a program to find the minimum of two numbers.
public class FirstTest {
    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int minimum = firstNumber < secondNumber ? firstNumber : secondNumber;
        System.out.println("The minimum of " + firstNumber + " and " + secondNumber + " is: " + minimum);
    }
}
