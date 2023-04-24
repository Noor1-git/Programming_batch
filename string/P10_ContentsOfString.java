package sowmyamaam.string;

public class P10_ContentsOfString {

	public static void main(String[] args) {
		String s = "HEllo$";
		String vowels = "";
		String Consonants = "";
		String spec = "";

		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i)>='A'&&s.charAt(i)<='z')
					&&!(s.charAt(i)>='0'&&s.charAt(i)<='9')) {
				spec=spec+s.charAt(i);
			} else if (s.charAt(i) == 'a' || s.charAt(i) == 'e' 
					|| s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' 
					|| s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				vowels += s.charAt(i);
			} else {
				Consonants = Consonants + s.charAt(i);
			}
		}
		System.out.println(vowels);
		System.out.println(Consonants);
		System.out.println(spec);

	}

}
