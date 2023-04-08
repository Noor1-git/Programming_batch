package sowmyamaam.methods;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number 1");
		int number1 = scanner.nextInt();
		System.out.println("Enter a number 2");
		int number2 = scanner.nextInt();
		System.out.println("Enter a number 3");
		int number3 = scanner.nextInt();
		scanner.close();

		compare(number1, number2, number3);
	}

	private static void compare(int number1, int number2, int number3) {

		System.out.println((number1 > number2 && number1 > number3) ? "Number 1 is greatest"
				: number2 > number3 ? "Number 2 is greatest" : "Number 3 is greatest");
	}

}
