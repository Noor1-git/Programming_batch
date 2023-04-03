package sowmyamaam.day7;

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Price");
		int price = scanner.nextInt();
		scanner.close();
		
		double effectivePrice=price-(price*0.10);
		
		System.out.println(effectivePrice);
	}

}
