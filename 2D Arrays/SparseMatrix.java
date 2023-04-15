package sowmyamaam.multidimarray;

public class SparseMatrix {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int [][] a= {{1,0,0},{2,0,0},{3,0,0}};
		int count0=0;
		int count1=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j]==0) {
					count0++;
				}else {
					count1++;
				}
			}
		}
		if (count0>count1) {
			System.out.println("Sparse Matrix");
		} else {
			System.out.println("Not a Sparse Matrix");
		}
	}
}