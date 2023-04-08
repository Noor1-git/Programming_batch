package sowmyamaam.recursion;

public class Print1_2 {

	static int num = 1;

	public static void main(String[] args) {

		if (num <= 10) {
			System.out.println(num++);
			main(null);
		}

	}

}