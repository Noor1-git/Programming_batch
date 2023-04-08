package sowmyamaam.recursion;

import java.util.Scanner;

public class NpowerP {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base");
		int base = scanner.nextInt();
		System.out.println("Enter a exponent");
		int ex = scanner.nextInt();
		scanner.close();
		System.out.println(power(base, ex));
	}

	private static int power(int base, int ex) {
		if (ex == 0) {
			return 1;
		}
		return base * power(base, ex - 1);
	}
}