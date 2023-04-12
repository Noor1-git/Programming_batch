package sowmyamaam.arrays;

public class PrimeElementOfArray34 {

	public static void main(String[] args) {
		int[] a = { 1, 6, 7, 3, 4, 5, 2 };
		int count1 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				continue;
			}
			int count = 0;
			for (int j = 2; j <= a[i] / 2; j++) {
				
				if (a[i] % j == 0) {
					count++;
				}

			}
			if (count == 0) {
				System.out.println("element " + a[i] + " is Prime");
				count1++;
			}
		}
		if (count1 == 0) {
			System.out.println("No Prime elements are present in array");
		}
	}

}
