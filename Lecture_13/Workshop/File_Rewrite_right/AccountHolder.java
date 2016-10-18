package File_Rewrite_right;

public class AccountHolder {
	int accountId;
	String branchName;
	String applicantsName;
	String accountType;
	int accountNumber;
	int balance;
	String emailId;
	int zipCode;
	
	public AccountHolder (int accountId, String branchName, String applicantsName, String accountType, int accountNumber, int balance, String emailId, int zipCode) {
		this.accountId = accountId;
		this.branchName = branchName;
		this.applicantsName = applicantsName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.emailId = emailId;
		this.zipCode = zipCode;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getApplicantsName() {
		return applicantsName;
	}

	public void setApplicantsName(String applicantsName) {
		this.applicantsName = applicantsName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}	
}
