package sowmyamaam.day6;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = scanner.nextInt();
		scanner.close();
		
//		if (year%4==0) {
//			if (year%100==0) {
//				if (year%400==0) {
//					System.out.println("Leap Year");
//				} else {
//					System.out.println("Not a Leap Year");
//				}
//			} else {
//				System.out.println("Leap Year");
//			}
//		} else {
//			System.out.println("Not a leap year");
//		}
		
		if ((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}

}
