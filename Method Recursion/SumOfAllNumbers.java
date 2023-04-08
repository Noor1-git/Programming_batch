package sowmyamaam.recursion;

import java.util.Scanner;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println(name(number-1));
	}

	public static int name(int num) {
		if (num==0) {
			return 0;
		}
		return num+name(num-1);
	}
}