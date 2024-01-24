package hasarelationship.containment1;

public class Loan {
	
	private int loadId;
	private String loanType;
	private double loanAmt;
	private double intrstRate;
	private String bankId;
	
	
	
	public Loan() {
		// TODO Auto-generated constructor stub
	}



	public Loan(int loadId, String loanType, double loanAmt, double intrstRate, String bankId) {
		super();
		this.loadId = loadId;
		this.loanType = loanType;
		this.loanAmt = loanAmt;
		this.intrstRate = intrstRate;
		this.bankId = bankId;
	}



	/**
	 * @return the loadId
	 */
	public int getLoadId() {
		return loadId;
	}



	/**
	 * @param loadId the loadId to set
	 */
	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}



	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}



	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}



	/**
	 * @return the loanAmt
	 */
	public double getLoanAmt() {
		return loanAmt;
	}



	/**
	 * @param loanAmt the loanAmt to set
	 */
	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}



	/**
	 * @return the intrstRate
	 */
	public double getIntrstRate() {
		return intrstRate;
	}



	/**
	 * @param intrstRate the intrstRate to set
	 */
	public void setIntrstRate(double intrstRate) {
		this.intrstRate = intrstRate;
	}



	/**
	 * @return the bankId
	 */
	public String getBankId() {
		return bankId;
	}



	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}



	@Override
	public String toString() {
		return "Loan [loadId=" + loadId + ", loanType=" + loanType + ", loanAmt=" + loanAmt + ", intrstRate="
				+ intrstRate + ", bankId=" + bankId + "]";
	}
	
	

}
