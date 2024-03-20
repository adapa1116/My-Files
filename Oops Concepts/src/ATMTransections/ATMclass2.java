package ATMTransections;

public class ATMclass2 extends ATMclass1 {

	
	public static void main (String args[]) {
		
		ATMclass1 kk=new ATMclass1();
		
		kk.deposit(5000); 
		kk.withdra(500);
		
		double balance= kk.getBalance();
		
		System.out.println("Current balaance: "+ balance);
		
	}
	
		
	

	}


