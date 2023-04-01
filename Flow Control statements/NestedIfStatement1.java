package sowmyamaam.day2;

import java.util.Scanner;

public class NestedIfStatement1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your Nationality");
		String nationality = scanner.nextLine();
		System.out.println("please enter your age");
		int age = scanner.nextInt();
		scanner.close();

		if (nationality == "indian") {
			if (age > 18) {
				System.out.println("you can vote..!!");
			} else {
				System.out.println("you're underage.");
			}
		} else {
			System.out.println("you're not a citizen of india");
		}

	}

}
