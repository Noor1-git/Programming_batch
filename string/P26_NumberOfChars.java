package sowmyamaam.string;

public class P26_NumberOfChars {

	public static void main(String[] args) {
		String s="Hello";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
			count++;
		}
		System.out.println("\n"+count);
	}

}
