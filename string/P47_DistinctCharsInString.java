package sowmyamaam.string;

public class P47_DistinctCharsInString {

	public static void main(String[] args) {
		String s="Hello";
		
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if (i==j) {
					continue;
				} else {
					if (s.charAt(i)==s.charAt(j)) {
						count++;
					}
				}
			}
			if (count==0) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
