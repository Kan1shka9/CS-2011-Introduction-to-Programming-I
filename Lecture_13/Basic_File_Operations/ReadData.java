package Chapter_12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// Create a file instance
		File file = new File("myscore.txt");
		
		// Create a scanner for the file
		Scanner sc = new Scanner(file);
		
		// Read data from file
		while (sc.hasNext()) {
			String fname = sc.next();
			String mname = sc.next();
			String lname = sc.next();
			int score = sc.nextInt();
			System.out.println(fname + " " + mname + " " + lname + " " + score);
		}
		
		// Close the file
		sc.close();

	}

}
