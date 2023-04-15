package sowmyamaam.multidimarray;

public class ScalarMatrix {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i!=j) {
					a[i][j]=0;
				}
			}
		}
		
		for (int[] i : a) {
			for (int i2 : i) {
				System.out.print(" "+i2);
			}
			System.out.println();
		}
	}

}
