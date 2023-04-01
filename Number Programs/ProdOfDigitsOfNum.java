package sowmyamaam.day4;

import java.util.Scanner;

public class ProdOfDigitsOfNum {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		scanner.close();
		System.out.println(prodDigits(number));
		
	}
	
	public static int prodDigits(int n) {
		
		int product=1;
		while (n!=0) {
			product=product*(n%10);
			n=n/10;
		}
		return product;
	}

}
