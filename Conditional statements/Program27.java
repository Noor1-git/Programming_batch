package sowmyamaam.day7;

import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the side");
		perimeter(scanner.nextDouble());
		scanner.close();
		
	}
	
	public static void perimeter(double side) {
		
		System.out.println("Perimeter of Square is :" +4*side);
	}

}
