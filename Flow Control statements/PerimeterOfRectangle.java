package sowmyamaam.day1;

import java.util.Scanner;

public class PerimeterOfRectangle {
	static Scanner scanner;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the length and breadth");
		Area(scanner.nextDouble(), scanner.nextDouble());
		scanner.close();

	}

	public static void Area(double length, double breadth) {

		System.out.println("Area of Square is :" + (2*length +2* breadth));
	}
}
