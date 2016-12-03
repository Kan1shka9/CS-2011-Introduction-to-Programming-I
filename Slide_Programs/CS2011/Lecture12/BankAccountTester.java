package CS2011.Lecture12;

import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
        BankAccount acc1 = new BankAccount();
        
        boolean done = false;
        
        while(done == false) {
            System.out.println("Enter a number between 1 and 5 \n");
            System.out.println("\t 1. Setup your account");
            System.out.println("\t 2. Withdraw ");
            System.out.println("\t 3. Balance");
            System.out.println("\t 4. Account Summary");
            System.out.println("\t 5. Exit");
            System.out.print("> ");
            
            
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice) {
                 
            case 1:
                System.out.println("Enter your ID : ");
                int new_id = input.nextInt();
                System.out.println("Enter your balance : ");
                int bal = input.nextInt();
                System.out.println("Enter your interest : ");
                int interest = input.nextInt();
                acc1.setBalance(bal);
                acc1.setId(new_id);
                acc1.setInterest(interest);
                System.out.println("");
                break;
                
            case 2:
            	System.out.println("Enter the amount you want to withdraw : ");
            	double withdraw = input.nextDouble();
            	acc1.setWithdraw(withdraw);
            	System.out.println("");
            	break;
            
            case 3:
            	System.out.println("Your balance is : " + (acc1.getBalance() - acc1.getWithdraw()));
            	System.out.println("");
                break;
            
            case 4:
                System.out.println("Your id is : " + acc1.getId());
                System.out.println("Your interest is : " + acc1.getInterest());
                System.out.println("Your balance is : "  + acc1.getBalance());
                System.out.println(acc1);
                System.out.println("");
                break;
                
            case 5:
                System.exit(0);
            }  
            
        }
        
    }  
	
}