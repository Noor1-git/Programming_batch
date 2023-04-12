package sowmyamaam.arrays;

import java.util.Arrays;

public class SelectionSort40 {

	public static void main(String[] args) {
		int a []= {50, 5, 10, 4, 1, 80};
		
		
		for (int i = 0; i < a.length; i++) {
			int index=i;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					index=j;	
				}
			}
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}