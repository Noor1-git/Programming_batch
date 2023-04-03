package sowmyamaam.day6;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your duration of service");
		int a=s.nextInt();
		s.close();
		if (a>5) {
			System.out.println("you are eligible for bonus of 5%");
		}else {
			System.out.println("you are not eligible for bonus of 5%");
		}
	}

}
