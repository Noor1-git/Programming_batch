package sowmyamaam.methods;

import java.util.Scanner;

public class CircumferrenceOfCircle {

	public static void main(String[] args) {
		circumferrence();
	}

	private static void circumferrence() {
		System.out.println("enter the value of radius");
		Scanner scanner=new Scanner(System.in);
		double d=scanner.nextDouble();
		System.out.println("Circumferrence of circle is : " + 2*3.14*d);
		scanner.close();
	}

}
