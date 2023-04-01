package sowmyamaam.day2;

import java.util.Scanner;

public class NestedIfStatement2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter your age");
		int age = scanner.nextInt();
		System.out.println("please enter your weight");
		int weight = scanner.nextInt();
		scanner.close();

		if (age > 18) {
			if (weight > 50) {
				System.out.println("you can donate blood");
			} else {
				System.out.println("sorry... Your weight is less than 50. Better luck next time.");
			}
		} else {
			System.out.println("you're underage for blood donation");
		}

	}

}
