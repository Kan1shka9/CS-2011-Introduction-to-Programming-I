package CS2011.Lecture13.CSVFileParse;

public class ParseDemo {

	public static void main(String[] args) {
		
		StudentParser parser = new StudentParser();
		
		try {
			parser.readFile();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		parser.showGrades();
		
	}
	
}