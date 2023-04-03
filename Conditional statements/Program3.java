package sowmyamaam.day6;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Alphabet/Number/Special Character");
		
		char a=s.next().charAt(0);
		s.close();
		if ((a>='a' && a<='z') || (a>='A' &&a<='Z')) {
			System.out.println("it is character");
		}else if (a>='0' && a<='9') {
			System.out.println("it is an Number");
		}else {
			System.out.println("it is Special Character");
		}
	}

}
