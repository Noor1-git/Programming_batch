package sowmyamaam.day2;

import java.util.Scanner;

public class NestedIfStatement3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Can you Drive? reply with \"true\" or \"false\"");
		boolean canDrive = scanner.nextBoolean();
		System.out.println("please enter your age");
		int age = scanner.nextInt();
		scanner.close();

		if (age > 18) {
			if (canDrive) {
				System.out.println("you can drive");
			} else {
				System.out.println("sorry... You have to learn driving");
			}
		} else {
			System.out.println("you're underage for driving");
		}

	}

}
