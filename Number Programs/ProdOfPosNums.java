package sowmyamaam.day3;

import java.util.Scanner;

public class ProdOfPosNums {

	public static void main(String[] args) {

		int product = 1;
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
				for (int i = number1; i <= number2; i++) {
					product *= i;
					
				}
				
			}
			else if (number1 > number2) {
				for (int i = number2; i <= number1; i++) {
					product *= i;
				}
			}
			System.out.println("Product of all numbers in range is : " + product);
		}

		scanner.close();
	}

}
