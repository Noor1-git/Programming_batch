package sowmyamaam.multidimarray;

import java.util.Arrays;

public class HighestElementInRow3 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 4, 5, 6, 4 }, { 7, 8, 9, 4 } };
		int[] b = new int[3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (b[i] < a[i][j]) {
					b[i] = a[i][j];
				}
			}
		}

		System.out.println(Arrays.toString(b));
	}

}
