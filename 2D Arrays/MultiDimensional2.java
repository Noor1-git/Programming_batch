package sowmyamaam.multidimarray;

import java.util.Scanner;

public class MultiDimensional2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter row");
		int r=scanner.nextInt();
		System.out.println("Enter columns");
		int c=scanner.nextInt();
		System.out.println("Enter row1");
		int r1=scanner.nextInt();
		System.out.println("Enter columns2");
		int c1=scanner.nextInt();
		int a[][]=new int [r][c];
		int b[][]=new int [r1][c1];
		int c2[][]=new int [r][c];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter element");
				a[i][j]=scanner.nextInt();
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("Enter element");
				b[i][j]=scanner.nextInt();
			}
		}
		
		for (int j = 0; j < a.length; j++) {
			for (int j2 = 0; j2<a[j].length ; j2++) {
				c2[j][j2]=a[j][j2]+b[j][j2];
			}
		}
		
		for (int[] is : c2) {
			for (int is2 : is) {
				System.out.print(" "+is2);
			}
			System.out.println();
		}
		scanner.close();
	}

}
