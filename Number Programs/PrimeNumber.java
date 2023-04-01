package sowmyamaam.day4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		scanner.close();
		if(isPrime(number)==1) {
			System.out.println("number is not prime");
		}
		else {
			System.out.println("Number is prime");
		}
	}

	private static int isPrime(int number) {
		int count=0;
		for (int i = 2; i <= number/2; i++) {
			if (number%i==0) {
				count++;
			}
		}
		return count;
	}

}
