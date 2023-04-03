package sowmyamaam.pattern.day2;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows to print");
		int row = scanner.nextInt();
		scanner.close();
		for (int i = row; i >=1; i--) {
			
			for (int j = 1; j <=i; j++) {
				
			System.out.print(i);
			}
			System.out.println();
		}

	}

}
