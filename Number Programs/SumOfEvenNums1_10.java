package sowmyamaam.day3;

public class SumOfEvenNums1_10 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 21; i++) {
			if (i % 2 == 0) {
				sum += i;

			}

		}
		System.out.println(sum);
	}

}
