package sowmyamaam.recursion;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		
		
		welcome(number);
	}

	private static void welcome(int number) {
		
		if (number<1) {
			return;
		} else {
			System.out.println("welcome");
			welcome(number-1);
		}
	}

}
