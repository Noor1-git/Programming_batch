package sowmyamaam.string;

public class P11_NoOfWordsInString {
	
	public static void main(String[] args) {
		String s="Hello Good After Noon";
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)==' ') {
				if ((s.charAt(i+1)!=' ')) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}