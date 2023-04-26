package collectionframework;

import java.util.ArrayList;

public class Program8 {

	public static void main(String[] args) {

		ArrayList<String> pu1 = new ArrayList<>();
		ArrayList<String> pu2 = new ArrayList<>();
		ArrayList<String> allSubs = new ArrayList<>();

		pu1.add("Physics1");
		pu1.add("Chemistry1");
		pu1.add("Maths1");
		pu1.add("Biology1");

		pu2.add("Physics2");
		pu2.add("Chemistry2");
		pu2.add("Maths2");
		pu2.add("Biology2");

		int index = 0;
		int index2 = 0;
		
		for (int i = 0; i <= (pu1.size()+pu2.size())-2; i++) {
			if (index<pu1.size()) {
				allSubs.add(pu1.get(index++));
				allSubs.add(pu2.get(index2++));
			}
		}
		System.out.println(allSubs);
	}
}