package sowmyamaam.day1;

import java.util.Scanner;

public class GreatestOfThreeNums {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		scanner.close();
		
		
//		if(a>b && a>c) {
//			System.out.println("A is greatest");
//		}
//		if(b>c) {
//			System.out.println("B is greatest");
//		}
//		else {
//			System.out.println("C is greatest");
//		}
		
		System.out.println((a>b&&a>c)?a+" is greatest":(b>c)?b+" is greatest":c+" is greatest");
		
	}

}
