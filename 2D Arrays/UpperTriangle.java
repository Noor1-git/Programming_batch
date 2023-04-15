package sowmyamaam.multidimarray;


public class UpperTriangle {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j<i) {
					a[i][j]=0;
				}
			}
		}
		
		for (int[] i : a) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
