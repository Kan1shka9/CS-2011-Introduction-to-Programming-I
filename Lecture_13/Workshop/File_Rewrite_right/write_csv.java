package File_Rewrite_right;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class write_csv {
	
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = "accountId,branchName,applicantsName,accountType,accountNumber,balance,emailId,zipCode";
	
	public void writeCsvFile(String fileName) throws IOException { 
		
		List<AccountHolder> accholder = new ArrayList<AccountHolder>();
		
		accholder.add(new AccountHolder(1,"LA","John","Savings",11111,15000,"john@zxc.com",12345));
		accholder.add(new AccountHolder(2,"LV","Doe","Current",22222,16000,"doe@asd.com",45678));
		accholder.add(new AccountHolder(3,"Boston","Jane","Savings",33333,17000,"jane@poi.com",74123));
		
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(fileName, true);
			fileWriter.append(FILE_HEADER);
			fileWriter.append(NEW_LINE_SEPARATOR);
			

			for (int i = 0; i < accholder.size(); i++) {
				fileWriter.write(String.valueOf(accholder.get(i).getAccountId()));
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(accholder.get(i).getBranchName());
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(accholder.get(i).getApplicantsName());
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(accholder.get(i).getAccountType());
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(String.valueOf(accholder.get(i).getAccountNumber()));
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(String.valueOf(accholder.get(i).getBalance()));
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(accholder.get(i).getEmailId());
				fileWriter.write(COMMA_DELIMITER);

				fileWriter.write(String.valueOf(accholder.get(i).getZipCode()));
				
				fileWriter.write(NEW_LINE_SEPARATOR);
			}
			System.out.println("CSV file was created successfully !!!");
		}
		finally {
			fileWriter.close();
		}
	}
}