package sowmyamaam.arrays;

import java.util.Arrays;

public class ReverseOfArray38 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		int [] b=new int[a.length];
		
		int bi=0;
		for (int i = b.length-1; i >=0 ; i--) {
			b[bi++]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
