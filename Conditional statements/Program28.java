package sowmyamaam.day7;

import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your percentage");
		double percent=scanner.nextDouble();
		scanner.close();
		
		if (percent>=80 && percent<100) {
			System.out.println("Grade : A+");
		}else if (percent<80&&percent>=60) {
			System.out.println("Grade : A");
		}else if (percent<60&&percent>=50) {
			System.out.println("Grade : B");
		}else if (percent<50&&percent>=35) {
			System.out.println("Grade : C");
		}else {
			System.out.println("Failed");
		}
	}

}
