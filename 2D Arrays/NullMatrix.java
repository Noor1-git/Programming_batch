package sowmyamaam.multidimarray;

public class NullMatrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		boolean flag=true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i==j) {
					if (a[i][j]!=1) {
						flag=false;
					}
				}else if (a[i][j]!=0) {
					flag=false;
				}
			}
		}
		
		if (flag) {
			System.out.println("Identity Matrix");
		} else {
			System.out.println("Not an Identity Matrix");
		}
	}
}


//for making matrix null

//for (int i = 0; i < a.length; i++) {
//	for (int j = 0; j < a[i].length; j++) {
//
//		a[i][j] = 0;
//	}
//}

//for (int[] i : a) {
//	for (int i2 : i) {
//		System.out.print(" " + i2);
//	}
//	System.out.println();
//}