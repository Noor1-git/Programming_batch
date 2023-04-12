package sowmyamaam.arrays;

import java.util.Scanner;

public class SecondOccuranceIndex29 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 5, 6 };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int key = scanner.nextInt();
		scanner.close();
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				count++;
			}
			if (count == 2) {
				System.out.println(key + " is present for second time at index " + i);
				break;
			}
			if (count < 2 && i == a.length - 1) {
				System.out.println("Element is not occuring for second time");
			}
		}

	}

}
