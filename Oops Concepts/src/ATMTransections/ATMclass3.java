package ATMTransections;

public class ATMclass3 {

	 private double balance;

	    public ATMclass3() {
	        balance = 0.0;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. Current balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount; // Subtract the withdrawal amount from the balance
	            System.out.println("Withdrawal successful. Withdrawal balance: " + amount);
	        } 
	        else {
	            System.out.println("Insufficient funds or invalid withdrawal amount.");
	        }
	    }

	    // Getter method to access balance (read-only)
	    public double getBalance() {
	        return balance;
	    }
	
	    public static void main(String[] args) {
		  
	        ATMclass3 atm = new ATMclass3();

	        // Accessing public methods of ATM class
	        atm.deposit(1000);
	        atm.withdraw(400);

	        // Accessing private field indirectly through public method
	        double balance = atm.getBalance();
	        System.out.println("Current balance: " + balance);
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


