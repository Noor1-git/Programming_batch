package sowmyamaam.day5;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int sum = scanner.nextInt();
		scanner.close();
		while (square(sum) >= 2) {
			sum = square(sum);
			System.out.println(sum);
			if (sum == 10) {
				System.out.println("Happy Number");
			} else if (sum < 10) {
				System.out.println("Not a Happy Number");
				break;
			}
		}

	}

	public static int square(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum + ((num % 10) * (num % 10));
			num = num / 10;
		}
		return sum;
	}

}