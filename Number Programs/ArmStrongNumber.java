package sowmyamaam.day4;

import java.util.Scanner;

public class ArmStrongNumber {

	static int digits = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();

		int number1 = number;
		int result = 0;
		int temp = number;

		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}

		while (number1 != 0) {

			result = result + power(number1 % 10);
			number1 = number1 / 10;
		}

		if (result == number) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not a ArmStrong Number");
		}

	}

	public static int power(int number) {
		int pro = 1;
		for (int i = 1; i <= digits; i++) {
			pro = pro * number;
		}
		return pro;
	}

}

//for (int i = number; i > 0; i = i / 10) {
//    digits++;
// }
//
// for (int i = number; i > 0; i = i / 10) {
//    int raise = 1;
//    for (int j = 1; j <= digits; j++) {
//       raise = raise * (i % 10);
//    }
//    result = result + raise;
// }
//
// if (result==number) {
//    System.out.println("ArmStrong Number");
// } else {
//    System.out.println("Not a ArmStrong Number");
// }
