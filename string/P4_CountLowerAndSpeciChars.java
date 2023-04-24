package sowmyamaam.string;

public class P4_CountLowerAndSpeciChars {

	public static void main(String[] args) {
		String s="Hello$";
		String upper="";
		String lower="";
		String spec="";
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				lower=lower+s.charAt(i);
			}else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				upper=upper+s.charAt(i);
			}else if (!(s.charAt(i)>='0' && s.charAt(i)<='9')) {
				spec=spec+s.charAt(i);
			}
			
		}
		
		System.out.println(upper.length());
		System.out.println(lower.length());
		System.out.println(spec.length());
		
	}

}
