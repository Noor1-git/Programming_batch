package sowmyamaam.arrays;

import java.util.Scanner;

public class ConvertStringToIntArray1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a name");
		String name=scanner.next();
		scanner.close();
		
		int [] nameArray=new int [name.length()];
		
		for (int i = 0; i < nameArray.length; i++) {
			
			nameArray[i]=name.charAt(i);
			System.out.println(nameArray[i]);
		}
	}

}
