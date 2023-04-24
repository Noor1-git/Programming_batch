package sowmyamaam.string;

public class P53_PangramString {

	public static void main(String[] args) {
		String s="abcd efgh ijklm nopqrs tuvwxyz";
		char c=' ';
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (char j ='a',j2='A'; j <= 'z'; j++,j2++) {
				if (s.charAt(i)==j || s.charAt(i)==j2) {
					count++;
				}
				c=j;
			}
			if (count==0) {
				System.out.println(c+" is not present");
				break;
			}
		}
		
	}

}
