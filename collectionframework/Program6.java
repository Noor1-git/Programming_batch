package collectionframework;

import java.util.LinkedList;

public class Program6 {

	public static void main(String[] args) {
		LinkedList<Object> linkedList=new LinkedList<>();
		LinkedList<Object> linkedList2=new LinkedList<>();
		
		linkedList.add("Penguin Random House.");
		linkedList.add("HarperCollins.");
		linkedList.add("Simon & Schuster.");
		linkedList.add("Hachette Livre.");
		linkedList.add("Macmillan.");
		
		linkedList2.addAll(linkedList);
		
		System.out.println(linkedList2);
		
	}

}
