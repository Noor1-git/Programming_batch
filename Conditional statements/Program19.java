package sowmyamaam.day7;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Perpendicular");
		int perpendicular = scanner.nextInt();
		System.out.println("Enter Base");
		int base = scanner.nextInt();
		System.out.println("Enter Hypotenus");
		int hypotenus = scanner.nextInt();
		scanner.close();
		
		if ((perpendicular*perpendicular)+(base*base)==(hypotenus*hypotenus)) {
			System.out.println("Triangle is pythagorean Triples");
		} else {
			System.out.println("Triangle is Not a pythagorean Triples");
		}
	}

}
