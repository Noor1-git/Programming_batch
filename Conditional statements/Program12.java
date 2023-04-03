package sowmyamaam.day6;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		s.close();
		if (a%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
	}

}
