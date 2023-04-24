package sowmyamaam.string;

public class P2_StringToArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s="Hello";
		char []a=s.toCharArray();
		int count=0;
		
		for (char c : a) {
			count++;
		}
		
		System.out.println(count);
	}
	

}
