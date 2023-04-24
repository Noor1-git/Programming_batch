package sowmyamaam.string;

public class P53_PangramString2 {

	public static void main(String[] args) {
		
		if (logic("The quick brown fox jumps over the lazy dog")) {
			System.out.println("Given String is Pangram");
		} else {
			System.out.println("Given String is Not Pangram");
		}
	}

	public static boolean logic(String string) {
		int[] a = new int[26];
		string = string.toLowerCase();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if ((ch >= 'a' && ch <= 'z')) {
				a[ch - 97] = 1;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
