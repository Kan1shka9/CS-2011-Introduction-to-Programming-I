package CS2011.Lecture13.Files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
	public static void main(String[] args) throws IOException {
		// Create file object
		File file = new File ("text.txt");
		
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		
		try ( PrintWriter out = new PrintWriter(file); ) {
			out.print("John Smith ");   // Write to a file
			out.println("101");
			out.print("Mary Jane ");
			out.println("50");
		}
	}
}