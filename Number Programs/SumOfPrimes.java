package sowmyamaam.day5;

import java.util.Scanner;

public class SumOfPrimes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number = scanner.nextInt();
		int number1 = scanner.nextInt();
		scanner.close();
		int sum=0;
		if (number > number1) {
			for (int i = number1; i <= number; i++) {
				int count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 0) {
					sum=sum+i;
				}
//	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
			}
		} else {
			for (int i = number; i <= number1; i++) {
				int count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 0) {
					sum=sum+i;
				}
			}
		}

	}

}
