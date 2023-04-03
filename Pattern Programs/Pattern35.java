package sowmyamaam.pattern.day2;

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows to print");
		int row = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=row; j++) {
				if (j<=(row-i)) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
				
			}
			System.out.println();
		}
	}

}
