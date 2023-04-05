package sowmyamaam.day6;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		double d=s.nextDouble();
		s.close();
		if (d%1>=0.5) {
			int ceil=(int)d+1;
			System.out.println(ceil);
		} else {
			int floor=(int)d;
			System.out.println(floor);
		}
	}

}
