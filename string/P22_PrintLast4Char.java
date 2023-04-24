package sowmyamaam.string;


public class P22_PrintLast4Char {

	public static void main(String[] args) {
		String s="solapur";
		if (s.length()<4) {
			System.out.println("string is less than 4 chars");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (i>=s.length()-4) {
					System.out.println(s.charAt(i));
				}
			}
		}
	}

}
