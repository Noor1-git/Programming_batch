package sowmyamaam.string;

public class P46_CountUppercaseChars {

	public static void main(String[] args) {
		String s="HellO";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
