package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {
		ArrayList<Object> arrayList=new ArrayList<>();
		
		arrayList.add("Hello");
		arrayList.add('z');
		arrayList.add(20);
		arrayList.add(true);
		arrayList.add(25.0);
		
		arrayList.remove(0);
		
		ArrayList<Object>  arrayList2=new ArrayList<>();
		arrayList2.add(50);
		
//		arrayList.add(arrayList2);
		arrayList.addAll(arrayList2);
		
		
		
		
		Iterator<Object> iterator=arrayList.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println(arrayList.containsAll(arrayList2));
		
		System.out.println(arrayList.contains(20));
		
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.get(0));
		
		System.out.println(arrayList.indexOf(50));
		
		System.out.println(arrayList.isEmpty());
		
	}
}