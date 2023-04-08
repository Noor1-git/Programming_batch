package sowmyamaam.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		
		
		System.out.println(factorial(number));
	}
	
	public static int factorial(int n) {
		if (n==1||n==0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}

}
