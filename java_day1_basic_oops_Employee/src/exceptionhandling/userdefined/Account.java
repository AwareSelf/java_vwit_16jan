package exceptionhandling.userdefined;

import java.time.LocalDateTime;

public class Account {
	
	
	private int acctId;
	private String acctName;
	private double bal;
	
	public Account(int acctId, String acctName, double bal) {
		super();
		this.acctId = acctId;
		this.acctName = acctName;
		this.bal = bal;
	}

	
	public String getAcctName() {
		return acctName;
	}


	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}


	public double getBal() {
		return bal;
	}


	public void setBal(double bal) {
		if(bal>0)
		{
		  this.bal = bal;
		}
		else
		{
			System.out.println("accoubt bal cant be 0 or -ve");
		}
	}


	public int getAcctId() {
		return acctId;
	}

	public void deposit(double amt)
	{
		this.bal = this.bal + amt;
		System.out.println("after depositing amt of rs:"+amt+", bal="+this.bal);
	}
	
	public double withdraw(double amt) throws InsufficientBalance 
	{
		/*
		if(bal<=2000)
		{
			throw NoMinimumBalException();
		}
		*/
		
		if(amt <= this.bal)
		{
			this.bal = this.bal - amt;
			return amt;
		}
		else
		{
		//	System.out.println("To wothdraw amt:"+amt+",Insufficient Balance:"+this.bal);
		
			throw new InsufficientBalance(this.bal,this.acctId,this.acctName,amt,LocalDateTime.now());
		}
		

	}

	@Override
	public String toString() {
		return "Account [acctId=" + acctId + ", acctName=" + acctName + ", bal=" + bal + "]";
	}
	
	

}
