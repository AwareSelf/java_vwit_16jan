package hasarelationship.containment1;

public class Customer {

	
	private int custId;
	private String custName;
	private String panCardNo;
	private Loan loan;
	
	
		
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	


	public Customer(int custId, String custName,String panCardNo) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.panCardNo = panCardNo;
	}

    


	public Customer(int custId, String custName, String panCardNo,Loan loan) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.panCardNo = panCardNo;
		this.loan = loan;
	}




	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}



	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}



	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}



	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}




	/**
	 * @return the loan
	 */
	public Loan getLoan() {
		return loan;
	}




	/**
	 * @param loan the loan to set
	 */
	public void setLoan(Loan loan) {
		this.loan = loan;
	}

    


	/**
	 * @return the panCardNo
	 */
	public String getPanCardNo() {
		return panCardNo;
	}




	/**
	 * @param panCardNo the panCardNo to set
	 */
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}




	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName 
				+ ",panCard no="+panCardNo+", loan=" + loan + "]";
	}
	
	

}
