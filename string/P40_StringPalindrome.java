package sowmyamaam.string;

public class P40_StringPalindrome {

	public static void main(String[] args) {
		String s="civic";
		
		int fi=0;
		int li=s.length()-1;
		boolean flag=true;
		while (fi<li) {
			if (s.charAt(fi)!=s.charAt(li)) {
				flag=false;
			}
			fi++;li--;
		}
		if (flag) {
			System.out.println(s+" is Plaindrome");
		} else {
			System.out.println(s+" is not Plaindrome");
		}
	}

}
