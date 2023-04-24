package sowmyamaam.string;

public class P8_CharToString {

	public static void main(String[] args) {
		char [] c= {'H','e','l','l','o'};
		String s="";
		
		for (int i = 0; i < c.length; i++) {
			s=s.concat(c[i]+"");
		}
		System.out.println(s);
	}

}
