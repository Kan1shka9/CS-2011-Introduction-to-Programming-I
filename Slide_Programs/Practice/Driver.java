package Practice;

public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p1 = new Person("man", 12);
		Person p2 = new Person("man2", 13);
		Person p3 = new Person("man", 12);
		Person p4 = new Person(p3);
		
		System.out.println(p4);
		System.out.println(p3);
		
		if (p1 instanceof Person) {
			System.out.println("p1 is instance of person");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1 = p2");
		}
		
		if (p1.equals(p1)) {
			System.out.println("p1 = p1");
		}
		
		if (p1.equals(p3)) {
			System.out.println("p1 = p3");
		}
		
		System.out.println(p1.compareTo(p2));
		
		Person per1  = new Person("OBjCome", 15);
		Person per2 = per1.clone();
		
		System.out.println(per1);
		System.out.println(per2);
		
	}

}