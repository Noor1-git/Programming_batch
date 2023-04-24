package sowmyamaam.string;

import java.util.Scanner;

public class P30_PositionOfChar {

	public static void main(String[] args) {
		String s="hello";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a char");
		char c =scanner.next().charAt(0);
		scanner.close();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==c) {
				System.out.println(s.charAt(i)+" is present at index "+i);
			}
		}
	}

}
