package sowmyamaam.multidimarray;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = new int [3][2];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i]=a[i][j];
			}
		}
		
		for (int[] i : b) {
			for (int i2 : i) {
				System.out.print(" " + i2);
			}
			System.out.println();
		}
	}

}
