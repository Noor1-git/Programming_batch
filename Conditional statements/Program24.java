package sowmyamaam.day7;

import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int number1=scanner.nextInt();
		System.out.println("Enter Number 2");
		int number2=scanner.nextInt();
		scanner.close();
		
		if (number1>number2) {
			System.out.println("Number 1 is Bigger");
		} else {
			System.out.println("Number 2 is Bigger");
		}
		
	}

}
