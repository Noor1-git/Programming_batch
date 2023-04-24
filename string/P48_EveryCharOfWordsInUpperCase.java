package sowmyamaam.string;

public class P48_EveryCharOfWordsInUpperCase {

	public static void main(String[] args) {
		String s="Hello Gohod Morning";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a'&&s.charAt(i)<='z') {
				s1=s1+(char)(s.charAt(i)-32);
			}else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
