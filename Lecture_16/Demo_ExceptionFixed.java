package CS2011.Lecture16;

import java.io.IOException;

public class Demo_ExceptionFixed {
	
	int x;
	public Demo_ExceptionFixed(int oldX){
		x = oldX + 1;
		System.out.println(x);
		Demo_ExceptionFixed d = new Demo_ExceptionFixed(x);
	}
	
	public static void main(String[] args) throws IOException{
		try {
			Demo_ExceptionFixed demo = new Demo_ExceptionFixed(1);
		}
		catch (StackOverflowError e) {
			System.out.println("Exception thrown :- " + e);
			e.printStackTrace();
		}
		
	}	

}