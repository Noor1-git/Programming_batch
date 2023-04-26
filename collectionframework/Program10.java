package collectionframework;

import java.util.TreeSet;

public class Program10 {

	public static void main(String[] args) {

		TreeSet<Menu> hs = new TreeSet<>();

		Menu item1 = new Menu("Tea", 10);
		Menu item2 = new Menu("Coffee", 15);
		Menu item3 = new Menu("Bun", 20);
		Menu item4 = new Menu("Bun Butter", 30);

		hs.add(item1);
		hs.add(item2);
		hs.add(item3);
		hs.add(item4);

		for (Object o : hs) {
			System.out.println(o);
		}
	}
}

class Menu implements Comparable<Menu> {
	String item;
	int price;

	public Menu(String item, int price) {
		this.item = item;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println(item);
		System.out.println(price);
		return "";
	}

	@Override
	public int compareTo(Menu o) {

		return this.price - o.price;
	}
}
