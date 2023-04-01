package sowmyamaam.day5;

import java.util.Scanner;

public class GCDOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number = scanner.nextInt();
		int number1 = scanner.nextInt();
		scanner.close();
		
		
		if (number > number1) {
			for (int i = number1; i >0 ; i--) {
				if ((number % i == 0) && (number1%i==0)) {
					System.out.println("Greatest Common Divisor of Numbers is : " + i);
					break;
				}
			}
		} else {
			for (int i = number; i >0 ; i--) {
				if ((number % i == 0) && (number1%i==0)) {
					System.out.println("Greatest Common Divisor of Numbers is : " + i);
					break;
				}
			}

		}

	}
}
