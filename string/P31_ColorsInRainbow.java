package sowmyamaam.string;

public class P31_ColorsInRainbow {

	public static void main(String[] args) {
		String colors= " Red orange yellow green blue indigo violet";
		
		for (int i = 0; i < colors.length(); i++) {
			if (colors.charAt(i)==' ') {
				System.out.println(colors.charAt(i+1));
			}
		}
		
	}

}
