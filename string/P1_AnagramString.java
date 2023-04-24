package sowmyamaam.string;

public class P1_AnagramString {

	public static void main(String[] args) {
		String s = "earth";
		String s1 = "heart";
		boolean flag = s.length() == s1.length();
		if (flag) {
			for (int i = 0; i < s.length(); i++) {
				int count = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s1.charAt(j)) {
						count++;
					}
				}
				if (count == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("AnaGram String");
			} else {
				System.out.println("Not an anagram String");
			}
		} else {
			System.out.println("Not an anagram String");
		}
	}
}