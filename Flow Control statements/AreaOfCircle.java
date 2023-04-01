package sowmyamaam.day1;

import java.util.Scanner;

public class AreaOfCircle {

	static Scanner scanner;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the radius");
		Area(scanner.nextDouble());
		scanner.close();

	}

	public static void Area(double radius) {

		System.out.println("Area of Circle is :" + 3.14*radius*radius);
	}

}
