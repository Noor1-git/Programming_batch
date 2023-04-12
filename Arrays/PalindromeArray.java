package sowmyamaam.arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		char [] c= {'c','i','v','i','c'};
		
		int fi = 0;
		int li = c.length - 1;
		boolean flag=true;
		
		while (fi<li) {
		
			if (c[fi]!=c[li]) {
				flag=false;
				break;
			}
			
			fi++;
			li--;
		}
		
		if (flag) {
			System.out.println("Palindrome array");
		} else {
			System.out.println("Not a Palindrome array");
		}
	}

}
