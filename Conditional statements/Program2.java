package sowmyamaam.day6;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter age");
		int a = s.nextInt();

		if (a > 18) {
			System.out.println("enter gender male/female");
			String b = s.next();
			if (b.equals("male")) {
				System.out.println("enter marital status /married  /unmarried ");
				String c = s.next();
				if (c.equals("married")) {
					System.out.println("local job location");
				} else {
					System.out.println("pan india");
				}

			} else {
				System.out.println("local job location");
			}
		} else {
			System.out.println("go to home kid");
		}
		s.close();
	}

}
