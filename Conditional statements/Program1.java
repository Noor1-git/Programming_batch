package sowmyamaam.day6;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter age of first person");
		int person1 = s.nextInt();
		System.out.println("enter age of second person");
		int person2 = s.nextInt();
		System.out.println("enter age of third person");
		int person3 = s.nextInt();
		if (person1 > person2 && person1 > person3) {
			System.out.println("first person is older");
		} else if (person2 > person1 && person2 > person3) {
			System.out.println("second person is older");
		} else {
			System.out.println("third person is older");
		}

		s.close();
	}

}
