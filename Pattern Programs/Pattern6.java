package sowmyamaam.pattern.day1;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Rows to Print");
		int rows = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <=rows; j++) {
				
				System.out.print(j);
			
			}
			System.out.println();
		}
	}

}
