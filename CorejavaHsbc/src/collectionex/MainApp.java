package collectionex;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayLstEx x = new ArrayLstEx();
		
		Account ob = new Account("Tina",1,5000);
		x.addAccount(ob);
		
		Account ob1 = new Account("Reema",2,10000);
		x.addAccount(ob1);
		
		x.displayAllAccounts(true);
		x.displayAllAccounts();
		
		ArrayList<Account> arrlst = new ArrayList<Account>(5);
		Account a1 = new Account("Namrata",1,5000);
		arrlst.add(a1);
		ArrayLstEx x1 = new ArrayLstEx(arrlst);
		x1.displayAllAccounts();
		
		Account a2 = new Account("Namrata",1,5000);
		if(x1.deleteAccount(a2))
		{
			System.out.println("Account with id:"+a2.getAcctNo()+" is present "
					+ "and deleted successfully");
		}
		x1.displayAllAccounts();
		
		/*
		x1.deleteAccount(n);
		x1.displayAllAccounts();
		*/
		
		Account act =  new Account("Rama",2,6000);
		x1.addAccount(act);
		boolean b = x1.isAccountPresent(new Account("Rama",2,6000));
		if(b) {
			System.out.println("account with acctid"+act.getAcctNo()
			+" is present");
		}
		
		
		
		
		

	}

}
