package sowmyamaam.day5;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i < number/2; i++) {
			
			if (i*i==number) {
				System.out.println("Square root of "+number+" is "+i);
				return;
			}
		}
	}

}
