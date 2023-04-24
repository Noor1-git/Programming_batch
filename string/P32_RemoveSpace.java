package sowmyamaam.string;

public class P32_RemoveSpace {

	public static void main(String[] args) {
		String s="Hello";
		String s1="";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				break;
			}else {
				count++;
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			s1=s.substring(count);
		}
		System.out.println(s1);
	}

}
