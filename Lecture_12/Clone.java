package CS2011.Lecture12;

public class Clone {
	private String name;
	
	public Clone(String nameIn){
		name = nameIn;
	}
	
	private void greet(){
		System.out.println("Hi, my name is " + name);
	}
	
	public static void main(String[] args){
		Clone bob = new Clone("Bob");
		Clone joe = new Clone("Joe");
		Clone mary = new Clone("Mary");
		
		bob.greet();
		joe.greet();
		mary.greet();		
	}
	
}