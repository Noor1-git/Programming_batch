package sowmyamaam.day6;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		double d=s.nextDouble();
		s.close();
		int a=(int)d;
		if (d%10>5 || d%10<=9) {
			a=a+1;
		}
		System.out.println(a);
	}

}
