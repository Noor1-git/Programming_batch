package sowmyamaam.arrays;

import java.util.Scanner;

public class OccuranceOfUserGiven10 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character");
		char c1= scanner.next().charAt(0);
		scanner.close();
		int count = 0;
		char[] c = { 'c', 'i', 'v', 'i', 'c' };
		
		for (int i = 0; i < c.length; i++) {
			
			if (c[i]==c1) {
				count++;
			}
		}
		
		if (count>0) {
			System.out.println("Occurance of "+c1+" is "+count+" times in array");
		} else {
			System.out.println("Element is not present in array");
		}
	}

}
