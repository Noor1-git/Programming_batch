package sowmyamaam.day4;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		scanner.close();
		if(isPalindrome(number)) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

	private static boolean isPalindrome(int number) {
		int reversedNum=0;
		int number1=number;
		while (number!=0) {
			reversedNum=reversedNum*10+(number%10);
			number=number/10;
		}
		return reversedNum==number1;
	}

}
