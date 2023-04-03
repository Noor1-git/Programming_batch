package sowmyamaam.day7;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year");
		int number = scanner.nextInt();
		scanner.close();
		
		if (number%8==0) {
			System.out.println("Number is multiple of 8");
		} else {
			System.out.println("Number is Not multiple of 8");
		}
	}

}
