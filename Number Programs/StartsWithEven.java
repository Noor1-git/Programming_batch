package sowmyamaam.day5;

import java.util.Scanner;

public class StartsWithEven {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number =scanner.nextInt();
		scanner.close();
		
		for (int i = number; i > 0; i=i/10) {
			if (i<10) {
				if (i%2==0) {
					System.out.println("Starts with an Even Number");
				} else {
					System.out.println("Starts with an Odd Number");
				}
			}
		}
	}

}
