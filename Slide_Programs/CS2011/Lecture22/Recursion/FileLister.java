package CS2011.Lecture22.Recursion;

import java.io.File;
import javax.swing.JOptionPane;

public class FileLister {
	
	private static StringBuilder indentation = new StringBuilder();

	public static void main(String args[]) {
		
		String start = JOptionPane.showInputDialog(null, "Please enter the starting directory");
		getDirectoryContent(start);
		
	}

	private static void getDirectoryContent(String filePath) {
		
		File currentDirOrFile = new File(filePath);
		if (!currentDirOrFile.exists()) {
			return;
		} 
		else if (currentDirOrFile.isFile()) {
			System.out.println(indentation + currentDirOrFile.getName());
			return;
		} 
		else {
			System.out.println("\n" + indentation + "|_" + currentDirOrFile.getName());
			indentation.append("   ");

			String[] s = currentDirOrFile.list();
			if (s != null) {
				for (String currentFileOrDirName : currentDirOrFile.list()) {
					getDirectoryContent(currentDirOrFile + "\\" + currentFileOrDirName);
				}
			}

			if (indentation.length() - 3 > 3) {
				indentation.delete(indentation.length() - 3, indentation.length());
			}
		}
	}
	
}