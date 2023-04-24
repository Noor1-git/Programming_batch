package sowmyamaam.string;

import java.util.Scanner;

public class P27_OccuranceOfParticularChar {

	public static void main(String[] args) {
		String s="hello";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=scanner.next().charAt(0);
		scanner.close();
		
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(c+" is occuring "+count+" times in String");
		
	}

}
