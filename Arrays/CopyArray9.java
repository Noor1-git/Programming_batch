package sowmyamaam.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
				
		char[] c = new char[5];

		for (int i = 0; i < c.length; i++) {
			System.out.println("Please enter a character");
			
			c[i] = scanner.next().charAt(0);
		}
		
		char [] newArray=c;
		
		System.out.println(Arrays.toString(newArray));
		scanner.close();

	}

}
