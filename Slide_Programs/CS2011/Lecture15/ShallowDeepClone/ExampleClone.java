package CS2011.Lecture15.ShallowDeepClone;

public class ExampleClone {
	
	// https://www.youtube.com/watch?v=KWbr7B5LDzs	
	// Clone is deep copy
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Zxc obj = new Zxc();
		obj.i = 5;
		obj.j = 6;
		
		Zxc obj1 = (Zxc) obj.clone();
		
		obj1.j = 8;
		
		System.out.println(obj); // i = 5 j = 6
		System.out.println(obj1); // i = 5 j = 8
	}
}

class Zxc implements Cloneable{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "i = " + i + " j = " + j;
	}
	
	@Override
	public Object clone () throws CloneNotSupportedException {
		return super.clone();
	}
}
