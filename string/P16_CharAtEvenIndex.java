package sowmyamaam.string;

public class P16_CharAtEvenIndex {

	public static void main(String[] args) {
		String s="Hello";
		
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				System.out.print(s.charAt(i)+", ");
			}
		}
	}

}
