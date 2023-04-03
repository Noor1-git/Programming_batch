package sowmyamaam.day6;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter runs");
		int a = s.nextInt();
		s.close();
		if (a <= 25) {
			System.out.println("poor performance");
		} else if (a > 25 && a <= 50) {
			System.out.println("good performance");
		} else if (a > 50 && a <= 75) {
			System.out.println("better performance");
		} else if (a > 75) {
			System.out.println("best performance");
		}
	}

}
