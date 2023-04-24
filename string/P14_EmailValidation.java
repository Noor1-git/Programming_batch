package sowmyamaam.string;

import java.util.Scanner;

public class P14_EmailValidation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String e=scanner.next();
		validate(e);
	
	}

	private static void validate(String e) {
		if (e.length()<15) {
			System.out.println("Email is too short atleast 15 chars required");
			return;
		}
		for (int i = 0; i < e.length(); i++) {
			if (e.charAt(i)>='A' && e.charAt(i)<='Z') {
				System.out.println("UpperCase Character not allowed");
				return;
			}
		}
		if (e.endsWith("@gmail.com")||e.endsWith("@gmail.org")||e.endsWith("@gmail.in")) {
			System.out.println("Email successful");
		}else {
			System.out.println("Invalid Domain or host name");
			
		}
	}

}
