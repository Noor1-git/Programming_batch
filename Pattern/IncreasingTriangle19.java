package sowmyamaam.day8;

import java.util.Scanner;

public class IncreasingTriangle19 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Rows to Print");
		int rows = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i <= rows; i++) {
			char letter='Z';
			for (int j = 1; j <=i; j++) {
				
				System.out.print(letter+" ");
				letter--;
			}
			
			System.out.println();
		}
	}

}
