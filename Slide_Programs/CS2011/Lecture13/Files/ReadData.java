package CS2011.Lecture13.Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		// Take the file from the user
		System.out.println("Enter a filepath to read from ");
		Scanner in = new Scanner(System.in);
		
		// Pass the file name to the file object
		File file = new File(in.next());
		
		// Enter C:\Users\Kanishka\workspace\Liang\myscore.txt
		
		// File object is passed to scanner for reading
		Scanner reader = new Scanner(file);
		
		// Read data from file
		while (reader.hasNext()) {
			String fname = reader.next();
			String mname = reader.next();
			String lname = reader.next();
			int score = reader.nextInt();
			System.out.println(fname + " " + mname + " " + lname + " " + score);
		}
		
		// Close the file
		reader.close();

	}

}