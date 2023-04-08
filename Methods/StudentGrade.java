package sowmyamaam.methods;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Marks of Subject 1");
		double m1=scanner .nextDouble();
		System.out.println("Enter Marks of Subject 2");
		double m2=scanner .nextDouble();
		System.out.println("Enter Marks of Subject 3");
		double m3=scanner .nextDouble();
		System.out.println("Enter Marks of Subject 4");
		double m4=scanner .nextDouble();
		System.out.println("Enter Marks of Subject 5");
		double m5=scanner .nextDouble();
		scanner.close();
		
		percent(m1,m2,m3,m4,m5);
	}

	private static void percent(double m1, double m2, double m3, double m4, double m5) {
		double percent=((m1+m2+m3+m4+m5)/500)*100;
		grade(percent);
	}

	private static void grade(double percent) {
		if (percent>=80 && percent<100) {
			System.out.println("Grade : A+");
		}else if (percent<80&&percent>=60) {
			System.out.println("Grade : A");
		}else if (percent<60&&percent>=50) {
			System.out.println("Grade : B");
		}else if (percent<50&&percent>=35) {
			System.out.println("Grade : C");
		}else {
			System.out.println("Failed");
		}
	}

}
