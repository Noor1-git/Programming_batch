package sowmyamaam.day7;

import java.util.Scanner;

public class program17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year");
		int number = scanner.nextInt();
		scanner.close();
		
		if (number>0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is Negative");
		}
		
	}

}