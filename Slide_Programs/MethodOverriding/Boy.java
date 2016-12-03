package MethodOverriding;

class Human{
	   public void eat(){
	      System.out.println("Human is eating");
	   }
}
	
class Boy extends Human{
	public void eat(){
	      System.out.println("Boy is eating");
	}
	public static void main( String args[]) {
	      Boy obj = new Boy();
	      obj.eat();
	}
}