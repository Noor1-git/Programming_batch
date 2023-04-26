package collectionframework;

import java.util.HashSet;

public class Program3 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		Integer prod=1;
		
		for (Integer object : hs) {
			prod=prod*object;
		}
		
		System.out.println(prod);
	}

}
