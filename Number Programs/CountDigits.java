package sowmyamaam.day4;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println(counter(number));

	}

	public static int counter(int n) {
		int digits = 0;
		while (n != 0) {
			digits++;
			n = n / 10;
		}
		return digits;
	}

}
