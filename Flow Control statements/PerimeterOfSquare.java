package sowmyamaam.day1;

import java.util.Scanner;

public class PerimeterOfSquare {
static Scanner scanner;
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the side");
		Area(scanner.nextDouble());
		scanner.close();
		
		
	}

	public static void Area(double side) {
	
		System.out.println("Perimeter of Square is :" +4*side);
	}
}
