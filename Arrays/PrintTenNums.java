package sowmyamaam.arrays;

public class PrintTenNums {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum is : " + sum);

		System.out.println("Average is : " + (sum / a.length));

	}

}
