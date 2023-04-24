package sowmyamaam.string;

import java.util.Scanner;

public class P54_RemoveAllOccurancesOfGivenChar {

	public static void main(String[] args) {
		String s="Hello";
		s=s.toLowerCase();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter which char to remove from string");
		char c=scanner.next().charAt(0);
		scanner.close();	
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==c) {
				continue;
			}else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);	
	}
}