package sowmyamaam.string;

public class P24_HideMobNo {

	public static void main(String[] args) {
		String s="1234567890";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if (i<=3) {
				s1=s1+s.charAt(i);
			}else {
				s1=s1+"*";
			}
		}
		System.out.println(s1);
	}

}
