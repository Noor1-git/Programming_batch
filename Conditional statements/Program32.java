package sowmyamaam.day7;

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a character");
		char letter=scanner.next().charAt(0);
		scanner.close();
//		char letter='a';
		if (letter>='a' && letter<='z') {
			System.out.println("Lowercase char");
		}else if (letter>='A'&& letter<='Z') {
			System.out.println("Uppercase char");
		} else {
			System.out.println("Invalid char");
		}
	}

}