package sowmyamaam.multidimarray;

public class CheckElementOfTwo7 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		
		for (int[] is : a) {
			for (int is2 : is) {
				int count=0;
				for (int[] is3 : b) {	
					for (int is4 : is3) {
						if (is2==is4) {
							count++;
						}
					}
				}
				if (count>0) {
					System.out.println(is2+" Is Present");
				}else { 
					System.out.println(is2+" Is not Present");
				}
			}
		}	
	}
}