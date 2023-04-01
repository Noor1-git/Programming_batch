package sowmyamaam.day5;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();

		int square = number * number;
		int temp = number;
		int temp1 = square;
		int digits = 0;
		int sum = 0;
		int result = 0;

		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}

		for (int i = 1; i <= digits; i++) {
			sum = sum * 10 + (temp1 % 10);
			temp1 = temp1 / 10;
		}

		while (sum != 0) {
			result = result * 10 + (sum % 10);
			sum = sum / 10;
		}

		if (result == number) {
			System.out.println("Number is \"Automorphic\" Number");
		} else {
			System.out.println("Number is Not a \"Automorphic\" Number");
		}
	}

}