package sowmyamaam.arrays;

import java.util.Scanner;

public class ReadFiveCharsFromUser {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		char[] c = new char[5];

		for (int i = 0; i < c.length; i++) {
			System.out.println("Please enter a character");
			
			c[i] = scanner.next().charAt(0);
		}
		scanner.close();
		
		System.out.println("First and Last Chars");
		System.out.println(c[0]);
		System.out.println(c[c.length - 1]);
	}

}
