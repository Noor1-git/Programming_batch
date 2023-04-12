package sowmyamaam.arrays;

import java.util.Arrays;

public class BubbleSort4 {

	public static void main(String[] args) {
		int [] a= {1,5,90,65,76,30};
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
