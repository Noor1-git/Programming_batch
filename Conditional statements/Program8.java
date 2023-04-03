package sowmyamaam.day6;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter length");
		int a=s.nextInt();
		System.out.println("enter width");
		int b=s.nextInt();
		s.close();
		
		if (a==b) {
			System.out.println("rectangle is square");
		}else {
			System.out.println("rectangle is not square");
		}
	}

}
