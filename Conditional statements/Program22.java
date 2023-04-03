package sowmyamaam.day7;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter UserName");
		String Username = scanner.nextLine();
		
		
		if (Username.equals(Username)) {
			System.out.println("Enter Password");
			String Pass=scanner.nextLine();
			scanner.close();
			if (Pass.equals(Pass)) {
				System.out.println("Login Succesfull");
			} else {
				System.out.println("Invalid Password");
			}
			
		} else {
			System.out.println("Invalid UserName");
		}
	}

}
