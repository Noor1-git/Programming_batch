package sowmyamaam.pattern.day2;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows to print");
		int row = scanner.nextInt();
		scanner.close();
		int print=1;
		for (int i = 1; i <=row; i++) {
			
			for (int j = 1; j <=i; j++) {
				if (print==1) {
					System.out.print(print);
					print=0;
				} else {
					System.out.print(print);
					print=1;
				}
			
			}
			System.out.println();
		}
	}

}
