package CS2011.Lecture20;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Extractor {

	// adapted from http://www.printmyfolders.com/Home/PDFBox-Tutorial

	public static void main(String[] args) {
		
		PDDocument pd;
		File input = new File("C:/Users/Kanishka/workspace/Slides_2011/src/CS2011/Lecture20/test_pdf.pdf");  // The PDF file from where you would like to extract
		try {
			pd = PDDocument.load(input);
			PDFTextStripper stripper = new PDFTextStripper();
			stripper.setEndPage(20);
			String text = stripper.getText(pd);

			if (pd != null) {
				pd.close();
			}
			System.out.println(text);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}