package sowmyamaam.day5;

import java.util.Scanner;

public class Exponent {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers\n"
				+ "1.Number\n"
				+ "2.Exponent\n");
		int number = scanner.nextInt();
		int number1 = scanner.nextInt();
		scanner.close();
		int result=1;
		for (int i = 1; i <= number1; i++) {
			result=result*number;
		}
		System.out.println(result);
	}

}
