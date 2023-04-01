package sowmyamaam.day5;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		
		if (number%7==0 ||lastDigit(number)==7 ) {
			System.out.println("Number is Buzz number");
		} else {
			System.out.println("Number is not a Buzz number");
		}
	}
	public static int lastDigit(int number) {
		int Return=0;
		for (int i = 1; i <=1; i++) {
			Return=number%10;
		}
		return Return;
	}

}
