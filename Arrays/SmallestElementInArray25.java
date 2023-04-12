package sowmyamaam.arrays;

public class SmallestElementInArray25 {

	public static void main(String[] args) {
		
		
		int[] a = { 100, 20, 300, 4};
		
		int smallest=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println("Smallest element of array : "+smallest);
		
	}

}
