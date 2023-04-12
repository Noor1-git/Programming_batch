package sowmyamaam.arrays;

public class HighestSumOfArrayElement18 {

	public static void main(String[] args) {

		int a[] = { 100, 200, 130, 40, 250, 260 };
		int sum = 0;
		
		
		for (int i = 0; i < a.length - 1; i++) {
			
			if (a[i] + a[i + 1] > sum) {
				sum = a[i] + a[i + 1];
			}
		}
		
		System.out.println(sum);
	}
}