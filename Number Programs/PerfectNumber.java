package sowmyamaam.day4;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		
		
		if (sum == number) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Pefect Number");
		}
	}
}
