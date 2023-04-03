package sowmyamaam.day6;

import java.util.Scanner;

public class Program14 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter first number");
	int a=s.nextInt();
	System.out.println("enter the second number");
	int b=s.nextInt();
	s.close();
	System.out.println(a>b?"firstnumber is greater":""
			+ "second number is greater");
}
}
