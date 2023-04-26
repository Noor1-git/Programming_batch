package collectionframework;

import java.util.HashMap;

public class Program5 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		
		hm.put("Subject1", 25);
		hm.put("Subject2", 35);
		hm.put("Subject3", 40);
		hm.put("Subject4", 63);
		hm.put("Subject5", 52);
		hm.put("Subject6", 60);
		hm.put("Subject7", 49);
		hm.put("Subject8", 29);
		hm.put("Subject9", 70);
		hm.put("Subject10", 67);
		
		for (HashMap.Entry<String, Integer> entry : hm.entrySet()) {
			
			System.out.println(entry);
		}
	}

}
