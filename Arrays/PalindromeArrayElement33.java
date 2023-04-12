package sowmyamaam.arrays;

public class PalindromeArrayElement33 {

	public static void main(String[] args) {
		int [] a= {111,232,123,10};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			int rev=0;
			for (int j = a[i]; j >0; j=j/10) {
				rev=rev*10+j%10;
			}
			if (a[i]==rev) {
				System.out.println(a[i]+" is a palindrome element of array");
				count++;
			}
		}
		if (count==0) {
			System.out.println("No palindrome elements are present in array");
		}
	}

}
