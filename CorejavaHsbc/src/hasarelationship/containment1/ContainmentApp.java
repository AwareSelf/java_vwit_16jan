package hasarelationship.containment1;

public class ContainmentApp {

	public ContainmentApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer(1,"Namrata","ANWP1045");
		
		Loan l = new Loan(1024,"Home Loan",1000000,7,"ICICI");
		
		c.setLoan(l);
		
		System.out.println(c);
		
		//get and show Customer Namrata's loan amount
		double amt = c.getLoan().getLoanAmt();
		System.out.println("customer "+c.getCustName()+" has Loan amount "+amt);

	}

}
