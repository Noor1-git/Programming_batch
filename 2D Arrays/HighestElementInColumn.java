package sowmyamaam.multidimarray;

import java.util.Arrays;

public class HighestElementInColumn {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 , 4}, { 4, 5, 6, 0 }, { 7, 8, 9, 0 } };
		int[] b = new int[4];

		for (int i = 0; i < b.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (b[i] < a[j][i]) {

					b[i] = a[j][i];

				}

			}

		}

		System.out.println(Arrays.toString(b));
	}

}
