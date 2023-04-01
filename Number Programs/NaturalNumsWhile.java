package sowmyamaam.day3;

import java.util.Scanner;

public class NaturalNumsWhile {

	public static void main(String[] args) {

		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two positive number");
		int temp = scanner.nextInt();
		int temp1 = scanner.nextInt();
		if (temp < 0 || temp1 < 0) {
			System.out.println("please enter a positive number");
		} else {
			int number1 = temp;
			int number2 = temp1;
			if (number1 < number2) {

				while (number1 <= number2) {
					sum = sum + number1;
					number1++;
				}
			} else if (number1 > number2) {
				while (number1 >= number2) {
					sum = sum + number2;
					number2++;
				}
			}
			System.out.println("Summation of all numbers in range is : " + sum);

			scanner.close();

		}

	}
}
