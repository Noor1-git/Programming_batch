package sowmyamaam.day5;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		int zeros = 0;
		for (int i = number; i > 0; i = i / 10) {
			if (i%10==0) {
				zeros++;
			}
		}
		if (zeros>0) {
			System.out.println("Duck Number");
		} else {
			System.out.println("Not a Duck Number");
		}
	}
}