package sowmyamaam.multidimarray;

public class SubtractionOfMatrices {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] c=new int [3][3];
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				c[i][j]=a[i][j]-b[i][j];
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
