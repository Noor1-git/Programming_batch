package sowmyamaam.arrays;

public class IdenticalArrays19 {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4};

		int[] b = { 5, 6, 7, 4, 9 };
		
		boolean bool=true;
		
		if (a.length!=b.length) {
			bool=false;
		}
		for (int i = 0; i < a.length; i++) {
			
				if (a[i]!=b[i]) {
					bool=false;
				}
			
		}
		
		if (bool) {
			System.out.println("Identical array");
		} else {
			System.out.println("Arrays are not Identical");
		}
	}

}
