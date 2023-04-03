package sowmyamaam.day7;

import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the length and breadth");
		Area(scanner.nextDouble(), scanner.nextDouble());
		scanner.close();

	}

	
	public static void Area(double length, double breadth) {

		System.out.println("Perimeter of Rectangle is :" + (2*length +2* breadth));
	}

}
