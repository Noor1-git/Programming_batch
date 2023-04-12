package sowmyamaam.arrays;

public class SecondLargestElement22 {

	public static void main(String[] args) {

		int[] a = { 10, 20, 300, 400, 500 };

		int largest = a[0];
		int secondLargest = 0;

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] > largest) {

				secondLargest = largest;
				largest = a[i];

			} else if (a[i] > secondLargest && a[i] != largest) {

				secondLargest = a[i];

			}

		}
		System.out.println("secondLargest element of array is : " + secondLargest + "  " + largest);
	}

}
