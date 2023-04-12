package sowmyamaam.arrays;

import java.util.Arrays;

public class ZigZagMerge42 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		int [] b= {1,2,3,4,5,6};
		int [] c=new int[a.length+b.length];
		int ai=0;
		int bi=0;
		
		for (int i = 0; i < c.length;) {
			if (ai<a.length) {
				c[i]=a[ai++];
				i++;
			}
			if (bi<b.length) {
				c[i]=b[bi++];
				i++;
			}
		}
		System.out.println(Arrays.toString(c));
	}
}