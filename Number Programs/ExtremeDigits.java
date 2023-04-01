package sowmyamaam.day5;

import java.util.Scanner;

public class ExtremeDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number =scanner.nextInt();
		scanner.close();
		
		int lastDigit=number%10;
		int firstDigit=0;
		for (int i = number; i >0; i=i/10) {
			if (i<10) {
				firstDigit=i;
			}
		}
		System.out.println("lastDigit : "+lastDigit+
				"\nfirstDigit : "+firstDigit);
	}

}
