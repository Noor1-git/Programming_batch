package sowmyamaam.day5;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		int count = 0;
		int rev = 0;
		for (int i = number; i > 0; i = i / 10) {
			count++;
			rev = rev * 10 + (i % 10);
		}
		int firstDigits = 0;
		int lastDigits = 0;
		if (count % 2 == 0) {
			for (int i = 1; i <= count; i++) {
				if (i <= count / 2) {
					firstDigits = firstDigits * 10 + (rev % 10);
					rev = rev / 10;
				} else {
					lastDigits = lastDigits * 10 + (rev % 10);
					rev = rev / 10;
				}
			}
			int sum = firstDigits + lastDigits;
			int square = sum * sum;
			if (number == square) {
				System.out.println("Tech Number");
			} else {
				System.out.println("Not a Tech Number");
			}
		} else {
			System.out.println("please enter number with even number of digits.");
		}
	}

}
