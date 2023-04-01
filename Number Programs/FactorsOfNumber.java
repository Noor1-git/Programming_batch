package sowmyamaam.day4;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		int count = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		System.out.println("Factors of Number " + number + " is " + count);
	}

}
