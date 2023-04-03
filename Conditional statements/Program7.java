package sowmyamaam.day6;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter char");
		char a=s.next().charAt(0);
		s.close();
		if (a>='a' && a<='z') {
			System.out.println("it is an lowercase character");
		}else if (a>='A' && a<='Z') {
			System.out.println("it is an uppercase character");
		}else {
			System.out.println("wrong input");
		}
	}

}
