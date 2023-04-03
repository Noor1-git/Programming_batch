package sowmyamaam.day6;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		int a=s.nextInt();
		System.out.println("enter second number");
		int b =s.nextInt();
		s.close(); 
		if (a>b) {
			System.out.println("first number is greater");
		}else {
			System.out.println("second number is greater");
		}
	}

}
