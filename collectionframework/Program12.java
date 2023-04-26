package collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

public class Program12 {

	public static void main(String[] args) {

		SortStudentByName byName = new SortStudentByName();
		SortStudentByAge byAge = new SortStudentByAge();

		Student student1 = new Student(1, "A", 5);
		Student student2 = new Student(2, "B", 7);
		Student student3 = new Student(3, "C", 4);
		Student student4 = new Student(4, "D", 8);
		Student student5 = new Student(5, "E", 9);

		TreeSet<Student> ts=new TreeSet<>(byName);
		ts.add(student1);
		ts.add(student2);
		ts.add(student3);
		ts.add(student4);
		ts.add(student5);

		for (Student student : ts) {
			System.out.println(student);
		}
		
		System.out.println("_____________________________________\n");
		
		TreeSet<Student> ts1=new TreeSet<>(byAge);
		ts1.add(student1);
		ts1.add(student2);
		ts1.add(student3);
		ts1.add(student4);
		ts1.add(student5);

		for (Student student : ts1) {
			System.out.println(student);
		}
	}
}

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

class SortStudentByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

class SortStudentByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age - o2.age;
	}
}