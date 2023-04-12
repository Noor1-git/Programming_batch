package sowmyamaam.arrays;

import java.util.Arrays;

public class MergeTwoArrays24 {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		int [] b= {6,7,8,9,10};
		int [] c=new int[a.length+b.length];
		int ai=0;
		int bi=0;
		for (int i = 0; i < c.length; i++) {
			if (ai<a.length) {
				c[i]=a[ai];
				ai++;
			}else {
				c[i]=b[bi];
				bi++;
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
