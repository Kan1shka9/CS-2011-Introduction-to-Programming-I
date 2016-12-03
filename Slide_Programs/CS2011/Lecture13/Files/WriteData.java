package CS2011.Lecture13.Files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteData {
	public static void main(String[] args) throws IOException {
		
		// Take the file from the user
		System.out.println("Enter a filepath to read from ");
		Scanner in = new Scanner(System.in);
				
		// Pass the file name to the file object
		File file = new File(in.next());
		
		// Check if file exists
		if (file.exists()) {
			System.out.println("File exists");
			System.exit(1);
		}
		
		// Create a file
		PrintWriter writer = new PrintWriter(file);
		
		// Write to a file
		writer.print("John Smith ");
		writer.println("100");
		writer.print("Eric Jones ");
		writer.println("80");
		
		// Close the file
		writer.close();
		
	}
	
}