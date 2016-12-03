package CS2011.Lecture13.FileCopy;

import java.util.*;
import java.io.*;

public class TextFileCopier {

	public static void main(String[] args) {
		// ... Get two file names from user.
		System.out.println("Enter a filepath to copy from, and one to copy to.");
		Scanner in = new Scanner(System.in);

		// ... Create File objects.
		File inFile = new File(in.next()); // File to read from.
		File outFile = new File(in.next()); // File to write to

		// ... Enclose in try..catch because of possible io exceptions.
		try {
			copyFile(inFile, outFile);

		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
		in.close();
	}

	public static void copyFile(File fromFile, File toFile) throws IOException {
		// File object is passed to scanner for reading
		Scanner reader = new Scanner(fromFile);
		
		// Write to file
		BufferedWriter writer = new BufferedWriter(new FileWriter(toFile));

		// ... Loop as long as there are input lines.
		String line = null;
		while (reader.hasNextLine()) {
			line = reader.nextLine();
			writer.write(line);
			writer.newLine();
		}

		// ... Close reader and writer.
		reader.close();
		writer.close();
	}

}