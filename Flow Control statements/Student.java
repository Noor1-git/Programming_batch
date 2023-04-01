package sowmyamaam.day2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter year of study");
		int year = scanner.nextInt();

		if (year == 2) {
			System.out.println("please enter your percentage");
			double percentage = scanner.nextDouble();
			if (percentage >= 80) {
				System.out.println("Distinction");
			} else if (percentage >= 60 && percentage < 80) {
				System.out.println("First class");
			} else if (percentage > 35 && percentage < 60) {
				System.out.println("Second class");
			} else if (percentage < 35) {
				System.out.println("Failed");
			}
		} else {
			System.out.println("You are not a student of second year");

		}
		scanner.close();
	}

}
