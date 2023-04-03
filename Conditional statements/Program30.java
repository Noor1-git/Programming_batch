package sowmyamaam.day7;

import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter number 1");
		double number1=scanner.nextDouble();
		System.out.println("please enter number 2");
		double number2=scanner.nextDouble();
		scanner.close();
		
		if ((number1+number2)>50) {
			System.out.println("sum of number1 and number2 is greater than 50");
		} else {
			System.out.println("sum of number1 and number2 is less than 50");
		}
	}

}
