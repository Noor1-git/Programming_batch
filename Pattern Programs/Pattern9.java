package sowmyamaam.pattern.day1;

public class Pattern9 {

	public static void main(String[] args) {

		int count=1;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if (count<10) {
					System.out.print(count+"  ");
					count++;
				}else {
				System.out.print(count+" ");
				count++;
				}
			}
			System.out.println();
		}
	}

}