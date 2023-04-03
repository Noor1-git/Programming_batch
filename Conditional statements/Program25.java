package sowmyamaam.day7;

import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int number1=scanner.nextInt();
		System.out.println("Enter Number 2");
		int number2=scanner.nextInt();
		scanner.close();
		
		System.out.println(number1>number2?"Number 1 is Bigger":"Number 2 is Bigger");
	}

}
