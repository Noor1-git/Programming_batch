package sowmyamaam.arrays;

public class Program12 {

	public static void main(String[] args) {
		// check whether all elements of first array are present in second array

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, };
		boolean flag = true;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
			if (count == 0) {
				flag = false;
			}
		}

		if (flag) {
			System.out.println("All Elements are present");
		} else {
			System.out.println("All Elements are Not present");
		}
	}

}
