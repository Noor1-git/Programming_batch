package sowmyamaam.string;

import java.util.Scanner;

public class P43_NoOfWorsStartWithVowel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter words separeted by spaces");
		String s = "hi apple umbrella hi";
		String s1="";
		scanner.close();

		for (int i = 0; i < s.length()-1; i++) {
			s1=s1+s.charAt(i);
			if (s.charAt(i)==' ') {
				if (s1.charAt(0)=='a'||s1.charAt(0)=='e'
						||s1.charAt(0)=='i'||s1.charAt(0)=='o'
						||s1.charAt(0)=='u'||s1.charAt(0)=='a'
						||s1.charAt(0)=='E'||s1.charAt(0)=='I'
						||s1.charAt(0)=='O'||s1.charAt(0)=='U'){
					System.out.println(s1);
					s1="";
				}else {
					s1="";
				}
			}
			
		}
	}
}