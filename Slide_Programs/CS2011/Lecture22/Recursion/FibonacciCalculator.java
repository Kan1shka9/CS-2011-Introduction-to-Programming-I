package CS2011.Lecture22.Recursion;

public class FibonacciCalculator {

	public static void main(String[] args) {
		
		FibonacciCalculator f = new FibonacciCalculator();
		
		for(int counter = 0; counter < 10; counter++) {
			long fib = f.fibonacci(counter);
			System.out.println("Fibonacci number No. " + counter + " = " + fib);
		}
		
	}
	
	public static long fibonacci(long n) {
		
		  // https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni10/node23.html
		  if (n < 0) 
			  return -1;  // F(n) is not defined when n is negative
		  if (n == 0)
		    return 0;
		  else if (n == 1)
		    return 1;
		  else
		    return fibonacci(n-1) + fibonacci(n-2);
		  
	}

}