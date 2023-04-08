package sowmyamaam.recursion;

import java.util.Scanner;

public class EvenOddInRange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Starting number");
		int n1 = scanner.nextInt();
		System.out.println("Enter a Ending number");
		int n2 = scanner.nextInt();
		scanner.close();
		numCheck(n1, n2);
	}

	private static void numCheck(int n1, int n2) {

		if (n1 > n2) {
			return;
		}
		if (n1 % 2 == 0) {
			System.out.println(n1 + " is Even Number");
			numCheck(n1 + 1, n2);
		} else {
			System.out.println(n1+ " is Odd Number");
			numCheck(n1 + 1, n2);
		}
		
	}
}