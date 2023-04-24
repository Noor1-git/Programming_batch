package sowmyamaam.string;

import java.util.Scanner;

public class P42_CompareTwoStrings {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first String");
		String s=scanner.next();
		System.out.println("Enter second String");
		String s1=scanner.next();
		scanner.close();
		
		if (s.equals(s1)) {
			System.out.println("String are Same");
		} else {
			System.out.println("String are not Same");
		}
	}

}
