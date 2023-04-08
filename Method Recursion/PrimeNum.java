package sowmyamaam.recursion;

import java.util.Scanner;

public class PrimeNum {
	static int count = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		scanner.close();

		isPrime(n);
		if (count >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

	public static void isPrime(int n) {
		int i = 2;
		if (i > n / 2) {
			return;
		}
		if (n % i == 0) {
			count++;
		}
		i++;
	}
}