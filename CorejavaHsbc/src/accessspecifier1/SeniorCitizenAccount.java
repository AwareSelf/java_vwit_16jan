package accessspecifier1;

import accessspecifier.Account;

public class SeniorCitizenAccount extends Account {
	int intRate;
	
	double calculateMonthlyInterest()
	{
		
		return (this.balance * this.intRate)/100;
	}
	
	
	public static void main(String[] args)
	{
		Account ob = new Account();
		//ob.balance = 600;
		ob = new SeniorCitizenAccount();
		//ob.balance = 6000;
		
	}

	
}
