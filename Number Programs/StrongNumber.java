package sowmyamaam.day4;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int comparison=number;
		scanner.close();
		
		int sum=0;
		while (number!=0) {
			sum=sum+factorial(number%10);
			number=number/10;
		}
		
		if (sum==comparison) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not a Strong Number");
		}
	}
	
	public static int factorial(int number) {
		int factorial=1;
		for (int i = 1; i <= number; i++) {
			factorial=factorial*i;
		}
		
		return factorial;
	}

}