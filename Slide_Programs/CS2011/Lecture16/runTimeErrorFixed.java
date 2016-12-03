package CS2011.Lecture16;

public class runTimeErrorFixed {

	public static void main(String[] args) {
		
		try {
			int quotient = 0;
			
			// Divide by 0
			for(int counter = 10; counter >=0; counter--){
				System.out.print("10 / " + counter + " = ");
				quotient = 10/counter;
				System.out.println (quotient);
			}			
		}
		
		catch (ArithmeticException e) {
			System.out.println("Exception :- " + e);
		}
		
		finally {
			System.out.println("\nExecutes irrespective of the exception happened or not");
		}
		
	}

}