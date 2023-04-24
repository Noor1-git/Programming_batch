package sowmyamaam.string;

public class P58_SwapTwoStrings {

	public static void main(String[] args) {
		String s="hello";
		String s1="bye";
		String s2="";
		System.out.println("Before swapping \n"+s+"\n"+s1);
		s2=s1;
		s1=s;
		s=s2;
		System.out.println("After swapping \n"+s+"\n"+s1);	
	}
}