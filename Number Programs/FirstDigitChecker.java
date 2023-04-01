package sowmyamaam.day5;

import java.util.Scanner;

public class FirstDigitChecker {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		scanner.close();
		int rev=0;
		for (int i = number; i > 0; i=i/10) {
			rev=rev*10+(i%10);
		}
		if ((rev%10)%2==0) {
			System.out.println("First digit of number is Even");
		} else {
			System.out.println("First digit of number is Odd");
		}
		
	}

}
