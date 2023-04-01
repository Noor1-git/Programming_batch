package sowmyamaam.day5;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		int stop=0;
		
		for (int i = 1; i <= (number+1)/2; i++) {
			if (i*i==(number+1)) {
				System.out.println("Sunny number");
				stop++;
				break;
			} 
		}
		if (stop==0) {
			System.out.println("Not a Sunny Number");
		}
	}

}
