package sowmyamaam.day8;

import java.util.Scanner;

public class IncreasingTriangle13 {

	public static void main(String[] args) {

		int count=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Rows to Print");
		int rows = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <=i; j++) {
				if (count<10) {
					System.out.print(count+"  ");
					count++;
				} else {
					System.out.print(count+" ");
					count++;
				}
				
			}
			System.out.println();
		}
	}

}
