package sowmyamaam.arrays;

import java.util.Scanner;

public class LinearSearch39 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter element to search");
		int key=scanner.nextInt();
		scanner.close();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==key) {
				System.out.println("Element Found at Index "+i);
				count++;
			}
		}
		if (count==0) {
			System.out.println("element Not found");
		}
	}

}
