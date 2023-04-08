package sowmyamaam.recursion;

import java.util.Scanner;

public class RevNum {
	static int rev=0;
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		scanner.close();
		rev(n);
		System.out.println(rev);
	}
		
	public static void rev(int n) {
		if (n==0) {
			return;
		}
		rev=rev*10+n%10;
		rev(n/10);
	}
}