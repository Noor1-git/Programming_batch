package sowmyamaam.recursion;

import java.util.Scanner;

public class CountNumbers {
	static int count = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		name(number);
		System.out.println(count);

	}

	public static void name(int num) {

		if (num < 15) {
			if (num == 14) {
				return;
			} else {
				count++;
				name(num + 1);
			}
		} else {
			if (num == 16) {
			} else {
				count++;
				name(num - 1);
			}
		}

	}

}
