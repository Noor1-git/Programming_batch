package sowmyamaam.day5;

import java.util.Scanner;

public class PerfectSquareNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		
		if (square(number)==number) {
			System.out.println("Number is Perfect Square Number");
		} else {
			System.out.println("Number is Not a Perfect Square Number");
		}
		
	}
	
	
	public static int square(int number) {
		int Return=0;
		for (int i = 1; i < number / 2; i++) {

			if (i * i == number) {
				Return=number;
			}
		}
		return Return;
	}

}
