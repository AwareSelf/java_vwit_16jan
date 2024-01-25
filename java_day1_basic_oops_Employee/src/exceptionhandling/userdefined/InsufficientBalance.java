package exceptionhandling.userdefined;

import java.time.LocalDateTime;

public class InsufficientBalance extends Exception {
	
	private double bal;
	private int acctId;
	private String acctName;
	private double amt;
	private LocalDateTime datetime;
	
	
	public InsufficientBalance(double bal, int acctId, String acctName, double amt, LocalDateTime datetime) {
		super();
		this.bal = bal;
		this.acctId = acctId;
		this.acctName = acctName;
		this.amt = amt;
		this.datetime = datetime;
	}


	@Override
	public String toString() {
		return "InsufficientBalance [bal=" + bal + ", acctId=" + acctId + ", acctName=" + acctName + ", amt=" + amt
				+ ", datetime=" + datetime + "]";
	}
	
	
	
	
	
	

}
