package sowmyamaam.day2;

import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("please enter a number");
		int number = key.nextInt();
	
		if (number>100) {
			if (number<200) {
				System.out.println("Number is in Range of 100 and 200");
			} else {
				System.out.println("Number is not in Range of 100 and 200");
			}
		} else {
			System.out.println("Number is lesser than 100");
		}
		key.close();
	}

}
