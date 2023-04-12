package sowmyamaam.arrays;

public class SecondSmallestElement26 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 50, 40 };
		int l = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > l) {
				l = a[i];
			}
		}
		int s1 = l;
		int s2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < s1) {
				s2 = s1;
				s1 = a[i];

			} else if (a[i] > s1 && a[i] < s2) {

				s2 = a[i];
			}
		}
		System.out.println("Second smallest element of array : \n" + s2);
	}

}
