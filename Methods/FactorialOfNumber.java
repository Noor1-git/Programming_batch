package sowmyamaam.methods;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner .nextInt();
		scanner.close();

		fact(number);
	}

	private static void fact(int i) {
		int fact=1;
		for (int j = 1; j <=i; j++) {
			fact=fact*j;
		}
		System.out.println(fact);
	}

}
