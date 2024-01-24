package accessspecifier;

public class Account {
	
	private int acctId;
	        String acctName;
	protected double balance;
	
		
		
	public int getAcctId() {
		return acctId;
	}


	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}


	public String getAcctName() {
		return acctName;
	}


	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	void deposit(double amt)
	{
		this.balance =  this.balance + amt;
	}
	
	
	protected boolean withdraw(double amt)
	{
		if(this.balance > amt)
		{
			this.balance =  this.balance - amt;
			return true;
		}
		else
		{
			System.out.println("Insufficient Balance");
			return false;
		}
	}

}
