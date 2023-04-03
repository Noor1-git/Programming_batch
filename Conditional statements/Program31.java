package sowmyamaam.day7;

import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Perpendicular");
		int perpendicular = scanner.nextInt();
		System.out.println("Enter Base");
		int base = scanner.nextInt();
		System.out.println("Enter Hypotenus");
		int hypotenus = scanner.nextInt();
		scanner.close();

		if ((perpendicular == hypotenus) && (hypotenus == base)) {
			System.out.println("Equilateral Triangle");
		} else if ((perpendicular == hypotenus) || (base == hypotenus) || (base == perpendicular)) {
			System.out.println("Isosceles Triangle");
		} else {
			System.out.println("Scalene Triangle");
		}
	}

}
