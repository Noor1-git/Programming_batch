package sowmyamaam.arrays;

import java.util.Scanner;

public class CubeOfAnArray36 {

	public static void main(String[] args) {
		
		int num []=new int [1];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		num[0]=scanner.nextInt();
		scanner.close();
		
		int qube=num[0]*num[0]*num[0];
		
		System.out.println(qube);
		
	}

}
