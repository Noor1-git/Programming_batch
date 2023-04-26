package collectionframework;

import java.util.HashSet;

public class Program7 {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		
		hashSet.add("Solapur");
		hashSet.add("Pune");
		hashSet.add("Mumbai");
		hashSet.add("Banglore");
		
		for (String string : hashSet) {
			System.out.println(string);
		}
	}

}
