package sowmyamaam.day6;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		s.close();
		if (a%6==0) {
			System.out.println("number is divisible by 6");
		}else {
			System.out.println("number is not divisible by 6");
		}
	}

}
