package sowmyamaam.arrays;

public class UniqueElementOfArray {

	public static void main(String[] args) {

		int[] a = { 4, 2, 3, 4, 4, 4};

//		int[] b = { 5, 6, 7, 4, 9 };

//		for (int i = 0; i < a.length; i++) {
//
//			boolean flag = true;
//
//			for (int j = 0; j < b.length; j++) {
//
//				if (a[i] == b[j]) {
//					flag = false;
//				}
//			}
//			if (flag) {
//				System.out.println(a[i]);
//			}
//		}
//
//		for (int i = 0; i < b.length; i++) {
//			boolean flag = true;
//			for (int j = 0; j < a.length; j++) {
//
//				if (b[i] == a[j]) {
//					flag = false;
//				}
//			}
//			if (flag) {
//				System.out.println(b[i]);
//			}
//		}
		
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(a[i]);
			}
		}
	}
}