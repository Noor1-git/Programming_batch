package sowmyamaam.string;

public class P52_PrintMaxOccuringChar {

	public static void main(String[] args) {
		String s="Hello";
		char c1=' ';
		int count1=0;
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < s.length(); j++) {		
					if (s.charAt(i)==s.charAt(j)) {
						count++;
						
					}
			}
			if (count>count1) {
				count1=count;
				c1=s.charAt(i);
			}
		}
		System.out.println(c1+" is max times ("+count1+") present in string ");
		
	}

}
