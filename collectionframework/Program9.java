package collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

public class Program9 {

	public static void main(String[] args) {
		TreeSet<Pizza> ts=new TreeSet<>(
				new Comparator<Pizza>() {

			@Override
			public int compare(Pizza o1, Pizza o2) {
				return o2.size - o1.size;
			}	
		}
	);
		
		Pizza small=new Pizza(9, 200);
		Pizza medium=new Pizza(12, 300);
		Pizza large=new Pizza(14, 400);
		Pizza xl=new Pizza(16, 450);
		
		ts.add(small);
		ts.add(medium);
		ts.add(large);
		ts.add(xl);
		
		for(Pizza p : ts) {
			System.out.println(p);
		}
	}
}


class Pizza{
	int size;
	int price;
	
	Pizza(int s,int p){
		this.size=s;
		this.price=p;
	}
	
	public String toString() {
		return size+" "+price;
	}	
}