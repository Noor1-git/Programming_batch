package sowmyamaam.methods;

import java.util.Scanner;

public class AreaOfPolygons {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Operation you want to perform\n"
							+ "1.Area of rectangle\n" 
							+ "2.Area of square\n"
							+ "3.Area of triangle\n" 
							+ "4.Area of circle\n");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Enter length");
			int n1 = scanner.nextInt();
			System.out.println("Enter breadth");
			int n2 = scanner.nextInt();
			areaOfRec(n1, n2);
			break;
		}
		case 2: {
			System.out.println("Enter side");
			int n1 = scanner.nextInt();
			areaOfSq(n1);
			break;
		}
		case 3: {
			System.out.println("Enter base");
			int n1 = scanner.nextInt();
			System.out.println("Enter height");
			int n2 = scanner.nextInt();
			areaOfTri(n1, n2);
			break;
		}
		case 4: {
			System.out.println("Enter Radius");
			int n1 = scanner.nextInt();
			areaOfCir(n1);
			break;
		}

		default:
			System.out.println("Invalid choice");
			break;
		}
		scanner.close();
	}

	public static void areaOfRec(double length, double breadth) {

		System.out.println("Area of rectangle is :" + length * breadth);
	}

	public static void areaOfSq(double side) {

		System.out.println("Area of Square is :" + side * side);
	}

	public static void areaOfTri(double base, double height) {

		System.out.println("Area of trianle is :" + 0.5 * (base * height));
	}

	public static void areaOfCir(double radius) {

		System.out.println("Area of Circle is :" + 3.14 * radius * radius);
	}

}