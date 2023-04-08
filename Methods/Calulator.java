package sowmyamaam.methods;

import java.util.Scanner;

public class Calulator {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Operation you want to perform\n"
				+ "1.Addition\n"
				+ "2.subtracion\n"
				+ "3.multiplication\n"
				+ "4.division\n"
				+ "5.quotiont\n"
				+ "6.remainder.");
		int choice=scanner.nextInt();
		
		switch (choice) {
		case 1:{
			System.out.println("Enter number 1");
			int n1=scanner.nextInt();
			System.out.println("Enter number 2");
			int n2=scanner.nextInt();
			addition(n1, n2);
			break;
		}
		case 2:{
			System.out.println("Enter number 1");
			int n1=scanner.nextInt();
			System.out.println("Enter number 2");
			int n2=scanner.nextInt();
			subtracion(n1, n2);
			break;
		}
		case 3:{
			System.out.println("Enter number 1");
			int n1=scanner.nextInt();
			System.out.println("Enter number 2");
			int n2=scanner.nextInt();
			division(n1, n2);
			break;
		}
		case 4:{
			System.out.println("Enter number 1");
			int n1=scanner.nextInt();
			System.out.println("Enter number 2");
			int n2=scanner.nextInt();
			multiplication(n1, n2);
			break;
		}
		case 5:{
			System.out.println("Enter number 1");
			int n1=scanner.nextInt();
			System.out.println("Enter number 2");
			int n2=scanner.nextInt();
			quotiont(n1, n2);
			break;
		}
		case 6:{
			System.out.println("Enter number 1");
			int n1=scanner.nextInt();
			System.out.println("Enter number 2");
			int n2=scanner.nextInt();
			remainder(n1, n2);
			break;
		}

		default:
			System.out.println("Invalid choice");
			break;
		}
		scanner.close();
	}

	public static void addition(int n1,int n2) {
		int add=n1+n2;
		System.out.println("Addition is : "+add);
	}

	public static void subtracion(int n1,int n2) {
		int add=n1-n2;
		System.out.println("subtracion is : "+add);
	}

	public static void multiplication(int n1,int n2) {
		int add=n1*n2;
		System.out.println("multiplication is : "+add);
	}

	public static void division(int n1,int n2) {
		int add=n1/n2;
		System.out.println("division is : "+add);
	}

	public static void quotiont(int n1,int n2) {
		int add=n1/n2;
		System.out.println("quotiont is : "+add);
	}
	
	public static void remainder(int n1,int n2) {
		int add=n1%n2;
		System.out.println("remainder is : "+add);
	}
}