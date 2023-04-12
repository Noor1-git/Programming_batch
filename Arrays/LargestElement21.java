package sowmyamaam.arrays;

public class LargestElement21 {

	public static void main(String[] args) {
		
		int[] a = { 1, 20, 3, 4};
		
		int largest=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println("Largest eleme"+largest);
	}

}
