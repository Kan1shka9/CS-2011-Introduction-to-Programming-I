package Chapter_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) throws IOException {
		// Create file object
		File file = new File("score.txt");
		
		if (file.exists()) {
			System.out.println("File exists");
			System.exit(1);
		}
		
		// Create a file
		PrintWriter output = new PrintWriter(file);
		
		// Write to a file
		output.print("John Smith");
		output.println("100");
		output.print("Eric Jones");
		output.println("80");
		
		// Close the file
		output.close();
	}
	
}