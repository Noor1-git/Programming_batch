package sowmyamaam.multidimarray;

public class MultiplicationOfMatrices {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }};
		int[][] b = { { 1, 2  }, { 4, 5 }, { 7, 8 } };
		int[][] c = new int [2][2];
		
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}		
		for (int[] i : c) {
			for (int i2 : i) {
				System.out.print(" " + i2);
			}
			System.out.println();
		}
	}

}
