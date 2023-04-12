package sowmyamaam.arrays;

public class OddArrayElements16 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 7, 10, 15 };
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
