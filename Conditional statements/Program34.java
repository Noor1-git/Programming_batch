package sowmyamaam.day7;

import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a character");
		char letter=scanner.next().charAt(0);
		scanner.close();
		
		if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
			System.out.println("Vowel");
		}else if (letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}

}
