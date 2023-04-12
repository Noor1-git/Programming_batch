package sowmyamaam.arrays;

public class SortingArrayWithoutThirdVar31 {

	public static void main(String[] args) {
		
		int [] a= {1,60,84,93,76,5,3};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
