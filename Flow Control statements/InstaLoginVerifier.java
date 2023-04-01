package sowmyamaam.day2;

import java.util.Scanner;

public class InstaLoginVerifier {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String userName="Nooruddin";
		String password="Noor@123";
		
		
		System.out.println("Enter Username");
		String userName1=scanner.nextLine();
		if (userName.equals(userName1)) {
			System.out.println("Enter password");
			String password1=scanner.nextLine();
			if (password.equals(password1)) {
				System.out.println("Login successful");
			} else {
				System.out.println("Invalid password");
			}
		} else {
			System.out.println("Invalid Username");
		}
		scanner.close();
	}

}
