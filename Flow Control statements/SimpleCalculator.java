package sowmyamaam.day2;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		boolean loop = true;
		Scanner key = new Scanner(System.in);
		System.out.println("please enter number1");
		int number1 = key.nextInt();
		System.out.println("please enter number2");
		int number2 = key.nextInt();
		while (loop) {

			System.out.println("Please choose an Operation to perform\n" + "1.Addition\n" + "2.Subtraction\n"
					+ "3.Divide\n" + "4.Multiply\n" + "5.Remainder\n" + "6.Exit");
			int choice = key.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Addition of number1 and number2 is : " + (number1 + number2));
				break;
			}
			case 2: {
				System.out.println("Difference of number1 and number2 is : " + (number1 - number2));
				break;
			}
			case 3: {
				System.out.println("Division of number1 and number2 is : " + (number1 / number2));
				break;
			}
			case 4: {
				System.out.println("Multiplication of number1 and number2 is : " + (number1 * number2));
				break;
			}
			case 5: {
				System.out.println("Remainder of number1 and number2 is :" + (number1 % number2));
				break;
			}
			case 6: {
				loop = false;
				System.out.println("Thank you...");
				break;
			}

			default:
				System.out.println("Invalid choice...Please choose an valid operation\n");
				break;
			}
		}
		key.close();
	}
}
