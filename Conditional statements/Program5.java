package sowmyamaam.day6;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your attendance");
		int a = s.nextInt();
		s.close();
		if (a > 65 && a <= 100) {
			System.out.println("Allowed to sit in Exam");
		}else {
			System.out.println("Not Allowed");
		}
	}

}
