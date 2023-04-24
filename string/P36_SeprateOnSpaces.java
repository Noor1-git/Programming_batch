package sowmyamaam.string;

public class P36_SeprateOnSpaces {

	public static void main(String[] args) {
		String s="Hello good Afternoon";
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {
				System.out.println();
				continue;
			}else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
