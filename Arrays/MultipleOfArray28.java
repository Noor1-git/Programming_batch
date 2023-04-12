package sowmyamaam.arrays;

public class MultipleOfArray28 {

	public static void main(String[] args) {
		int [] a= {5,9,6,7,3,8,25,14};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i==j) {
					continue;
				} else {
					if (a[i]%a[j]==0) {
						System.out.println(a[i]+" is a multiple of "+a[j]);
						break;
					}
				}
			}
		}
	}

}
