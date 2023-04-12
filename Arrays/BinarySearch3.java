package sowmyamaam.arrays;

import java.util.Scanner;

public class BinarySearch3 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		int mi = (a.length - 1) % 2;
		int fi = 0;
		int li = a.length - 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter element to search");
		int e = scanner.nextInt();
		scanner.close();

		while (fi < a.length) {

			if (a[mi] == e) {
				System.out.println("element found at index : " + mi);
				break;
			} else if (e > a[mi]) {
				fi = mi + 1;
			} else {
				li = mi - 1;
				
			}
			mi=(fi+li)/2;
		}
	}

}
