package sowmyamaam.day4;

import java.util.Scanner;

public class SumOfDigitsOfNum {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		scanner.close();
		System.out.println(sumDigits(number));
		
	}
	
	public static int sumDigits(int n) {
		
		int sum=0;
		while (n!=0) {
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}

}
