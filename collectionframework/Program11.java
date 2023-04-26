package collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

public class Program11 {

	public static void main(String[] args) {

		
		SortByPrice price=new SortByPrice();
		SortByRam ram=new SortByRam();
		
		TreeSet<Laptop> ts=new TreeSet<>(price);
		TreeSet<Laptop> ts1=new TreeSet<>(ram);
		
		Laptop laptop=new Laptop(7000, 8);
		Laptop laptop2=new Laptop(5500, 4);
		Laptop laptop3=new Laptop(8000, 2);
		
		ts.add(laptop);
		ts.add(laptop2);
		ts.add(laptop3);
		
		for (Laptop o : ts) {
			System.out.println(o);
		}
		System.out.println("____________________________________\n");
		ts1.add(laptop);
		ts1.add(laptop2);
		ts1.add(laptop3);
		
		for (Laptop o : ts1) {
			System.out.println(o);
		}	
	}
}

class Laptop {
	double price;
	int ram;
	
	public Laptop(double price, int ram) {
		super();
		this.price = price;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", ram=" + ram + "]";
	}	
}

class SortByPrice implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		return (int) (o1.price-o2.price);
	}
}

class SortByRam implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		return o1.ram-o2.ram;
	}
}