package sowmyamaam.multidimarray;

import java.util.Scanner;

public class MultiDimensional1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows to add");
		int row = scanner.nextInt();
		System.out.println("Enter columns to add");
		int col = scanner.nextInt();

		int b[][] = new int[row][col];

//		int[][] a = { { 1, 2, 3 }, { 3, 4, 3 } };

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("Enter the element");
				b[i][j] = scanner.nextInt();

			}
			System.out.println();
		}
		scanner.close();

		for (int[] is : b) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.println();
		}
	}
}