package CS2011.Lecture13.Files;

import java.io.File;
import java.util.Date;

public class TestFileClass {

	public static void main(String[] args) {
		
		File file = new File("map.txt");
		System.out.println("Exist or not " + file.exists());
		System.out.println("The file is " + file.length() + " bytes");
		System.out.println("Can it be read " + file.canRead());
		System.out.println("Can it be written to " + file.canWrite());
		System.out.println("Is it a file " + file.isFile());
		System.out.println("Is it a directory " + file.isDirectory());
		System.out.println("Is it absolute " + file.isAbsolute());
		System.out.println("Is it hidden " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Last modifies on " + new Date(file.lastModified()));
		
		// Create new directory
		File dir = new File("C:\\new_dir");
		dir.mkdirs();
		
		System.out.println(dir);
		System.out.println(file);
		
		// rename file
		// File newName = new File("map2.txt");
		// System.out.println("renaming the file " + file.renameTo(newName));
	}

}