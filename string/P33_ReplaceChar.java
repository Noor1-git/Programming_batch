package sowmyamaam.string;

import java.util.Scanner;

public class P33_ReplaceChar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=scanner.next();
		scanner.close();
		
		s=s.replace('h', 'c');
		System.out.println(s);
	}

}
