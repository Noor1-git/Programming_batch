package sowmyamaam.arrays;

public class SumAsTen32 {

	public static void main(String[] args) {
		int[] a = { 1, 8, 6, 3, 7, 2, 4, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (i == j) {
					continue;
				}
				if (a[i] + a[j] == 10) {
					System.out.println("Elements " + a[i] + " " + a[j] + " are having sum as 10");
				}
			}
		}
	}
}