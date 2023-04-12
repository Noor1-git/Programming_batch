package sowmyamaam.arrays;

public class RepeatedElementOfArray {

	public static void main(String[] args) {
		char [] c= {'c','i','v','i','c'};
		
		for (int i = 0; i < c.length; i++) {
			int count=0;
			for (int j = i; j < c.length; j++) {
				if (c[i]==c[j]) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(c[i]);
			}
		}
	}
}