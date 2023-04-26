package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Program4 {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		
		arrayList.add("Vanilla");
		arrayList.add("Mango");
		arrayList.add("chocolate");
		arrayList.add("Strawberry");
		arrayList.add("Pista");
		
		
		Iterator<String> iterator=arrayList.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
}