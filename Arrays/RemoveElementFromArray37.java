package sowmyamaam.arrays;

import java.util.Scanner;

public class RemoveElementFromArray37 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		int b []= new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter at which index to remove value");
		int index=(scanner.nextInt())-1;
		scanner.close();
		
		int count=0;
		for (int i = 0; i < a.length; i++) {	
			if (i==index) {
				continue;
			}
			b[count++]=a[i];
		}
		for (int i : b) {
			System.out.println(i);
		}
	}

}
