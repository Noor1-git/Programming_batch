package sowmyamaam.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtIndex20 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 4, 5 };
		Scanner scanner = new Scanner(System.in);
		int[] b = new int[a.length + 1];
		System.out.println("Enter at which index to add");
		int ind = scanner.nextInt();
		if (ind<b.length) {
			System.out.println("Enter the element");
			int ele = scanner.nextInt();
			scanner.close();
			int count = 0;
			for (int i = 0; i < b.length; i++) {
				if (i == ind) {
					b[i] = ele;
					continue;
				}
				b[i] = a[count++];
			}
			System.out.println(Arrays.toString(b));
		}else {
			System.out.println("Invalid index");
		}	
	}
}