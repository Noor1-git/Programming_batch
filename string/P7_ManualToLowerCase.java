package sowmyamaam.string;

public class P7_ManualToLowerCase {

	public static void main(String[] args) {
		String s="SoLaPur";
		String s1="";
		char [] c=new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)>='A'&&s.charAt(i)<='Z')) {
				c[i]=(char)(s.charAt(i)+32);
			}else {
				c[i]=(s.charAt(i));
			}
			s1=s1+c[i];
		}
		System.out.println(s1);
	}

}
