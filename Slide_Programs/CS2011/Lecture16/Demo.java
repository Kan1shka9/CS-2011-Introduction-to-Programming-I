package CS2011.Lecture16;

public class Demo {
	
	int x;
	public Demo(int oldX) {
		
		x = oldX + 1;
		System.out.println(x);
		Demo d = new Demo(x);
		
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo(1);
		
	}	
	
}