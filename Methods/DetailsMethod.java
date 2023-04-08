package sowmyamaam.methods;

public class DetailsMethod {

	public static void main(String[] args) {

		nooruddinDetails("xxxx",2,"xx/xx/xxxx");
	}
	
	public static void nooruddinDetails(String name) {
		System.out.println("Name : "+name);
	}
	public static void nooruddinDetails(String name,int age) {
		System.out.println("Name : "+name+"\nAge : "+age);
	}
	public static void nooruddinDetails(String name,int age,String dob) {
		System.out.println("Name : "+name+"\nAge : "+age+"\nDoB : "+dob);
	}
}