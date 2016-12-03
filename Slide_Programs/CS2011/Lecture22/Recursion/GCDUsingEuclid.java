package CS2011.Lecture22.Recursion;

import javax.swing.JOptionPane;

public class GCDUsingEuclid {
	
	  public static int gcd(int p, int q) {// recursive implementation
	        if (q == 0) 
	        	return p;
	        else 
	        	return gcd(q, p % q);
	  }

	  public static int gcd2(int p, int q) {// non-recursive implementation
	        while (q != 0) {
	            int temp = q;
	            q = p % q;
	            p = temp;
	        }
	        return p;
	  }

	  public static void main(String[] args) {
		  
		  int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the first integer"));
	      int q = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the second integer"));
	      int d  = gcd(p, q);
	      int d2 = gcd2(p, q);
	      JOptionPane.showMessageDialog(null, "gcd(" + p + ", " + q + ") = " + d);
	      JOptionPane.showMessageDialog(null, "gcd(" + p + ", " + q + ") = " + d2);
 
	    }

}