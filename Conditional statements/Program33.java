package sowmyamaam.day7;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a character");
		int age=scanner.nextInt();
		scanner.close();
		if (age>18) {
			System.out.println("Eligible for voting");
		} else {
			System.out.println("Not Eligible for voting");
		}
	}

}
