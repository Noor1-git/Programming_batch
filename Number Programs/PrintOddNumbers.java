package sowmyamaam.day5;

import java.util.Scanner;

public class PrintOddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number = scanner.nextInt();
		int number1 = scanner.nextInt();
		scanner.close();
		
		if (number>number1) {
			for (int i = number1; i <=number; i++) {
				if (i%2!=0) {
					System.out.println(i);
				}
			}
		} else {
			for (int i = number; i <=number1; i++) {
				if (i%2!=0) {
					System.out.println(i);
				}
			}
		}

	}

}