package sowmyamaam.string;

public class P15_EvenAsciiValue {

	public static void main(String[] args) {
		String s="Hello";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			int a=s.charAt(i);
			
			if (a%2==0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
