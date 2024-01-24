package accessspecifier;

public class PensionAccount extends Account {
	
	double interestRate;
	String nominee;
	
	
	double calculateMonthlyPension()
	{
		this.balance = (this.balance * this.interestRate) / 100; 
		
		return this.balance;
	}
	
	
	
	
	
	

}
