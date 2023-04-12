package sowmyamaam.arrays;

public class PrintElementAtEvenIndexAndProd13 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int prod=1;
		
		
		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				System.out.println(a[i]);
				prod=prod*a[i];
			}
		}
		System.out.println(prod);
	}

}
