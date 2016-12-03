package MethodOverriding;

public class driver {

	public static void main(String[] args) {
		methodOverriding obj = new methodOverriding();
		OverridingChild obj2 =  new OverridingChild();
		
		obj.overridingParent();
	 // obj.methodOverridingChild();
		obj2.methodOverridingChild();
		obj2.overridingParent();
	}
}