package sowmyamaam.day5;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		int sum=0;
		int prod=1;
		
		while (number!=0) {
			sum+=(number%10);
			prod*=(number%10);
			number/=10;
		}
		System.out.println(sum);
		System.out.println(prod);
		if (sum==prod) {
			System.out.println("Number is a Spy Number");
		} else {
			System.out.println("Number is not a Spy Number");
		}
		
	}

}
