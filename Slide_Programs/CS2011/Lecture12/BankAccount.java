package CS2011.Lecture12;

public class BankAccount {
	
	 	private int id = 0;
	 	
	 	private double balance = 0;
	    
	 	private double interest = 0;
	    
	 	private double withdraw = 0;
	     
	    // Constructor 1
	    public BankAccount(){
	    }
	    
	    // Constructor 2
	    public BankAccount(int newID, double newBalance, double newInterest){
	    	id = newID;
			balance = newBalance;
			interest = newInterest;
	    }
	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public double getInterest() {
	        return interest;
	    }

	    public void setInterest(double interest) {
	        this.interest = interest;
	    }
	    
	    public double getWithdraw() {
	        return withdraw;
	    }

	    public void setWithdraw(double withdraw) {
	        this.withdraw = withdraw;
	    }
	    
	    public String toString(){
	        return "ID " + id + " Interest " + interest + " Balance " + balance;
	    }	
	    
}