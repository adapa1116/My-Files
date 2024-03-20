package ATMTransections;

public class ATMclass1 {

   private double balance;

	public ATMclass1() {
		
		balance=0.0;
	}
	public void deposit(double amount) {
		
		if(amount>0) {
			
			balance += amount;
			
			System.out.println("Deposit successfully. Current balance: " + balance);
			
		}
		else {
			System.out.println(" Invalid deposit amount ");
			
		}
	
	}
	
	public void withdra(double amount) {
		 
		  if (amount > 0 && balance >= amount) {
	           
	        	balance -= amount;
	          
	        	System.out.println("Withdrawal successful " + amount);
	        } 
		
		
		else {
			
			 System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}
	
	public double getBalance() {
		
		
		return balance;
	}
	
	
}
	



	

