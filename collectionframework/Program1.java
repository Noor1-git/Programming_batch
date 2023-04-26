package collectionframework;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		ArrayList<Person> arrayList=new ArrayList<>();
		Person Ramesh=new Person(20, "Ramesh");
		Person Suresh=new Person(27, "Suresh");
		Person Lalit=new Person(35, "Lalit");
		Person kaleen=new Person(40, "kaleen");
		Person Guddu=new Person(15, "Guddu");
		
		arrayList.add(Ramesh);
		arrayList.add(Suresh);
		arrayList.add(Lalit);
		arrayList.add(kaleen);
		arrayList.add(Guddu);
		
		for (Person person : arrayList) {
			if (person.age%2==0) {
				System.out.println(person);
			}	
		}
	}
}

class Person{
	String name;
	int age;
	
	public Person(int age,String name) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return name+" "+age;
	}
}