package sowmyamaam.arrays;

public class SameElementsOfTwoArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 4 ,5,5};

		int[] b = { 5, 6, 7, 4, 4, 9,5 };
		
		int key=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i]==key) {
					continue;
				}
				if (a[i] == b[j]) {
					key=a[i];
					System.out.println(a[i]);
				}
			}
		}
	}

}
