package sowmyamaam.day2;

import java.util.Scanner;

public class NestedIfStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter a number");
		int number = scanner.nextInt();
		scanner.close();

		if (number > 0) {
			if (number % 2 == 0) {
				System.out.println("Number is positive and even");
			} else {
				System.out.println("number is positive and odd");
			}
		} else {
			System.out.println("Please enter a positive number");
		}

	}

}
