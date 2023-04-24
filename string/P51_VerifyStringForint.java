package sowmyamaam.string;

public class P51_VerifyStringForint {

	public static void main(String[] args) {
		String s="0123";
		boolean flag=true;
		
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)>='0'&&s.charAt(i)<='9')) {
				flag=true;
			}else {
				flag=false;
			}
		}
		
		if (flag) {
			System.out.println("int String");
		} else {
			System.out.println("Not an int String");
		}
	}

}
