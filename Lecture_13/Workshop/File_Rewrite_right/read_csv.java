package File_Rewrite_right;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class read_csv {
	
	public static void main(String[] args) throws IOException {
		try {
			// Take the file from the user
			System.out.println("Enter the file :- ");
			Scanner sc = new Scanner(System.in);
			String fileName = sc.next();
						
			// Write to the file
			write_csv obj = new write_csv();
			obj.writeCsvFile(fileName);
						
			// Create a file object
			File file = new File(fileName);
					
			// Create a scanner for the file
			Scanner newscan = new Scanner(file);
						
			String line;
			String[] fields;
						
			int accountId;
			String branchName;
			String applicantsName;
			String accountType;
			int accountNumber;
			int balance;
			String emailId;
			int zipCode;
					    
			newscan.nextLine(); // skip the header
						
			// Read data from file
			while (newscan.hasNextLine()) {
				line = newscan.nextLine();
				fields = line.split(",");
				
				accountId = Integer.parseInt(fields[0]);
				branchName = fields[1];
				applicantsName = fields[2];
				accountType = fields[3];
				accountNumber = Integer.parseInt(fields[4]);
				balance = Integer.parseInt(fields[5]);
				emailId = fields[6];
				zipCode = Integer.parseInt(fields[7]);
				
				System.out.println(accountId + " " + branchName + " " + applicantsName + " " + accountType + " " + accountNumber + " "+ balance + " " + emailId + " " + zipCode);
			}
						
			// Close the file
			newscan.close();
		}
		catch (Exception e) {
			System.out.println("Exception!!");
		}
	}
}