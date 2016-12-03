package CS2011.Lecture13.Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataWithAutoClose {

	public static void main(String[] args) throws IOException{
		// Create a file instance
		File file = new File("myscore.txt");
		
		// Create a Scanner for the file
		try ( Scanner sc = new Scanner(file); ) {
			// Read data from a file
		     while (sc.hasNext()) {
		        String firstName = sc.next();
		        String mi = sc.next();
		        String lastName = sc.next();
		        int score = sc.nextInt();
		        System.out.println(firstName + " " + mi + " " + lastName + " " + score);
		     	}
		
		}
	}
}