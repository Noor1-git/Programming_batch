package sowmyamaam.string;

public class P50_FirstCharOfEachWordInUppercase {

	public static void main(String[] args) {

		String s = "hello good morning";
		String s1 = "";
		if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
			s1 = s1 + (char) (s.charAt(0) - 32);
		} else {
			s1 = s1 + s.charAt(0);
		}

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				s1=s1+s.charAt(i);
				i++;
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					s1 = s1 + (char) (s.charAt(i) - 32);
				} else {
					s1 = s1 + s.charAt(i );
				}
			} else {
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}