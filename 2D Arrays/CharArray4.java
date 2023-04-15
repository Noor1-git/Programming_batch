package sowmyamaam.multidimarray;

public class CharArray4 {

	public static void main(String[] args) {
		char [][] c= {{'a','b','c'},{'d','e','f'},{'h','i','j'}};
		
		for (char[] ca : c) {
			for (char cha : ca) {
				System.out.print(cha+" ");
			}
			System.out.println();
		}
	}

}
