package sowmyamaam.day1;

import java.util.Scanner;

public class NumberChecker {

	static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Please enter first number");
		double number = scanner.nextDouble();
		System.out.println(number % 2 == 0 ? "Number is even\n" : "Number is odd\n");
		System.out.println(number < 0 ? "Number is negative\n" : "Number is positive\n");
		
		
		System.out.println("please enter second number");
		double number1 = scanner.nextDouble();
		scanner.close();
		if (number == number1) {
			System.out.println("Both the numbers are equal");
		} else {
			System.out.println(number < number1 ? "First Number is smaller\n" : "second number is smaller\n");
			System.out.println(number > number1 ? "First number is greater\n" : "second number is greater\n");
		}

	}

}
