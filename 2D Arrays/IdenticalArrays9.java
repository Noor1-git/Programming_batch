package sowmyamaam.multidimarray;

public class IdenticalArrays9 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean flag=true;
		l1:
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (a[i][j]!=b[i][j]) {
					flag=false;
					break l1;
				}
			}
		}
		
		if (flag) {
			System.out.println("Identical Matrices");
		} else {
			System.out.println("Not Identical Matrices");
		}
	}

}
