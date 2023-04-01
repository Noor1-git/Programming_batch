package sowmyamaam.day2;

import java.util.Scanner;

public class MoneyAndBike {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter amount");
		int amount = scanner.nextInt();

		if (amount > 60000) {
			System.out.println("please enter no of bikes you want to buy");
			int bike = scanner.nextInt();
			if (bike == 1) {
				System.out.println("amount is sufficient to buy a bike");
			} else {
				System.out.println("amount is not sufficient to buy a bike");
			}

		} else {
			System.out.println("Take loan from bank to buy a bike.");
		}
		scanner.close();
	}
}
