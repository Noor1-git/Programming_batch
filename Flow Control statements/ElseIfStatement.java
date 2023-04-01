package sowmyamaam.day2;

import java.util.Scanner;

public class ElseIfStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter your marks");
		int marks = scanner.nextInt();
		scanner.close();

		if (marks>=85) {
			System.out.println("you have scored distinction");
		}
		else if (marks<85 && marks>=35) {
			System.out.println("you have scored first class");
		}
		else if(marks<35) {
			System.out.println("you are failed");
		}
		
	}

}
