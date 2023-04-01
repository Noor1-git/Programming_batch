package sowmyamaam.day2;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("please enter a number");
		int number=scanner.nextInt();
		scanner.close();
		if(number%5==0 && number%15==0) {
			System.out.println("number is multiple of 5 and 15");
		}
		else {
			System.out.println("number is not multiple of 5 and 15");
		}
	}

}
