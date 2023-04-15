package sowmyamaam.multidimarray;

import java.util.Arrays;

public class SumOfColumsOfMatrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] b = new int[3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i] += a[j][i];
			}
		}

		int l = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] > l) {
				l = b[i];
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println("Highest sum is " + l);
	}

}
