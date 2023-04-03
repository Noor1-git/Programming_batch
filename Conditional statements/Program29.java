package sowmyamaam.day7;

import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your Marks of Subject 1");
		double subject1=scanner.nextDouble();
		System.out.println("please enter your Marks of Subject 2");
		double subject2=scanner.nextDouble();
		System.out.println("please enter your Marks of Subject 3");
		double subject3=scanner.nextDouble();
		System.out.println("please enter your Marks of Subject 4");
		double subject4=scanner.nextDouble();
		scanner.close();
		
		
		double percent=((subject1+subject2+subject3+subject4)/4);
		
		System.out.println("Percentage : "+percent);
	}

}
