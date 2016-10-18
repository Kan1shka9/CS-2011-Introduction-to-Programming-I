/**
 * Write a program which has two classes.First class would write csv file which contains Bank data(eg.account Id,Branch Name,Applicant's Name,Account Type,Account number,Balance,Email_id,Zip code)
 * CSV file should contain column header and followed by the data.
 * And the second class will read the above generated csv file and print the data in console.
 */

package Lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readCSV {
	
	public static void main(String[] args) {
		System.out.println("Enter the file :- ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
				 
		writeCSV obj = new writeCSV();
		obj.writeCsvFile(fileName);

		try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
		{
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}