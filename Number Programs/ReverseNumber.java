package sowmyamaam.day4;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println(reverser(number));

	}

		public static int reverser(int n) {
			int reversedNum = 0;
			while (n != 0) {
				reversedNum=reversedNum*10+n%10;
				n = n / 10;
			}
			return reversedNum;
		}

}
