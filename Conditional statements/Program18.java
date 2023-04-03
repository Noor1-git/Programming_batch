package sowmyamaam.day7;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.println(number>0?"Positive Number":"Negative Number");
	}

}
