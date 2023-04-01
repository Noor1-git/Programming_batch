package sowmyamaam.day3;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter a positive number");
		int num=scanner.nextInt();
		scanner.close();
		int factorial=1;
		if (num<0) {
			System.out.println("please enter a \"positive\" number");
		}else {
		
		for (int i = 1; i <= num; i++) {
			factorial*=i;
		}
		System.out.println("Factorial of Number "+num +" is "+factorial);
		}
		
	}

}
