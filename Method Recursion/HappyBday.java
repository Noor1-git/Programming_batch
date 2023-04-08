package sowmyamaam.recursion;

import java.util.Scanner;

public class HappyBday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		
		
		happyBirthday(number);
	}

	private static void happyBirthday(int number) {
		
		if (number<1) {
			return;
		} else {
			System.out.println("Happy Birthday");
			happyBirthday(number-1);
		}
	}

}
