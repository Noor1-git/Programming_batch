package sowmyamaam.day5;

import java.util.Scanner;

public class XylemNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number =scanner.nextInt();
		scanner.close();
		
		int lastDigit=number%10;
		int firstDigit=0;
		int midDigits=0;
		
		
		for (int i = number/10; i >0; i=i/10) {
			if (i<10) {
				firstDigit=i;
			}else {
				midDigits+=i%10;
			}
		}
		
		
		if (midDigits==(firstDigit+lastDigit)) {
			System.out.println("Xylem Or Phloem Number");
		} else {
			System.out.println("Not a Xylem Or Phloem Number");
		}
	}

}
