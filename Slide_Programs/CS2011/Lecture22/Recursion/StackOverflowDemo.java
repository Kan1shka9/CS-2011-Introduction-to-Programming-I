package CS2011.Lecture22.Recursion;

public class StackOverflowDemo {

	public static void main(String[] args) {
		
		int x = 1;
		StackOverflowDemo s = new StackOverflowDemo();
		s.recurseToOverflow(x);
		
	}
	
	public void recurseToOverflow(int x) {
		
		System.out.println("instance " + x);
		x = x + 1;
		recurseToOverflow(x);	
		
	}

}