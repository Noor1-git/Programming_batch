package sowmyamaam.string;

public class P25_OddLowerEvenUpper {

	public static void main(String[] args) {
		String s="Hello";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				if (s.charAt(i)>='a'&&s.charAt(i)<='z') {
					s1=s1+(char)(s.charAt(i)-32);
				}else {
					s1=s1+s.charAt(i);
				}
			}else {
				if (s.charAt(i)>='A'&&s.charAt(i)<='Z') {
					s1=s1+(char)(s.charAt(i)+32);
				}else {
					s1=s1+s.charAt(i);
				}
			}
		}
		System.out.println(s1);
	}

}
