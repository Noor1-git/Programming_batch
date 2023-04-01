package sowmyamaam.day5;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("please Enter a Number");
		int number =scanner.nextInt();
		scanner.close();
		
		int square=number*number;
		int result=0;
		while(square!=0) {
			result+=(square%10);
			square=square/10;
		}
		if (result==number) {
			System.out.println("Number is \"Neon\" Number");
		} else {
			System.out.println("Number is Not a \"Neon\" Number");
		}
	}

}
