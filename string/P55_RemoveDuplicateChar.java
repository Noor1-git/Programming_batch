package sowmyamaam.string;


public class P55_RemoveDuplicateChar {

	public static void main(String[] args) {
		String s="llllHellhhhhhohhhhh";
		String s1="";
		s=s.toLowerCase();
			
		for (int i = 0; i < s.length(); i++) {
			String s2=s.charAt(i)+"";
			if (s1.contains(s2)) {
				continue;
			} else {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
