package sowmyamaam.string;

public class P12_DuplicateChar {

	public static void main(String[] args) {
		String s = "Hello";
		char [] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count=0;
			for (int j = i+1; j < c.length; j++) {
				if (c[i]==c[j] && c[j]!='*') {
					count++;
					c[j]='*';
				}
			}
			if (count>=1) {
				System.out.println(c[i]);
			}
		}			
	}
}