package core_java.control_statements.assignment;

import java.util.Scanner;

/*Create a program to create a simple calculator that uses a
switch statement to perform basic arithmetic operations
like addition, subtraction, multiplication, and division. */
public class Sixth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for addition:" + "Press 2 for subtraction:" + "Press 3 for multiplication:"
				+ "Press 4 for division:");
		String operation = sc.next();
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		switch (operation) {
		case "1":
			result = a + b;
			break;
		case "2":
			result = a - b;
			break;
		case "3":
			result = a * b;
			break;
		case "4":
			result = a / b;
			break;
		}
		System.out.println("Result is : " + result);
	}
}
