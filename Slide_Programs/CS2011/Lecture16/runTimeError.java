package CS2011.Lecture16;

public class runTimeError {
	
	public static void main(String[] args){
		
		int quotient = 0;
		
		// Divide by 0
		for(int counter = 10; counter >= 0; counter--) {
			
			System.out.print("10 / " + counter + " = ");
			quotient = 10/counter;
			System.out.println (quotient);
			
		}
		
	}
	
}