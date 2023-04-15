package sowmyamaam.multidimarray;

public class Double2DArray6 {

	public static void main(String[] args) {
		double [][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		for (double[] ds : a) {
			for (double ds2 : ds) {
				System.out.print(ds2+" ");
			}
			System.out.println();
		}
	}

}
