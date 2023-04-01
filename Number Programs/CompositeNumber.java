package sowmyamaam.day5;

import java.util.Scanner;

public class CompositeNumber {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number =scanner.nextInt();
		scanner.close();
		
		int count=0;
		for (int i = 2; i <=number/2; i++) {
			if (number%i==0) {
				count++;
			}
		}
		if (count>0) {
			System.out.println("Composite number");
		}else {
			System.out.println("Not a Composite number");
		}
	}

}
