package CS2011.Lecture13.Files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCSV {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a filepath to read from ");
		Scanner in = new Scanner(System.in);
				
		File file = new File(in.next());
		
		PrintWriter writer = new PrintWriter(file);
		
		writer.print("John Smith");
		writer.print(",");
		writer.println("100");
		writer.print("Eric Jones");
		writer.print(",");
		writer.println("80");
		
		writer.close();
		
	}

}