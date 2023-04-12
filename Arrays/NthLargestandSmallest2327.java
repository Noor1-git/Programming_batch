package sowmyamaam.arrays;

import java.util.Scanner;

public class NthLargestandSmallest2327 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter which Smallest and Largest Element to search");
		int pos=scanner.nextInt();
		scanner.close();
		
		int[] a = { 10, 20, 30, 50, 40 };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println(pos+"  Largest element is "+a[(a.length-pos)]);
		System.out.println(pos+"  Smallest element is "+a[pos-1]);
	}

}
