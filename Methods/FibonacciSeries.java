package sowmyamaam.methods;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner .nextInt();
		scanner.close();

		fibonacci(number);
	}

	private static void fibonacci(int number) {
		
		int a=0,b=1,c;
		for (int i = 1; i <=number; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		
	}

}
