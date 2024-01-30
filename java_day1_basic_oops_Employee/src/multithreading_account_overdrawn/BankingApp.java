package multithreading_account_overdrawn;

public class BankingApp {

	public static void main(String[] args) {
		
		
		Account ob = new Account("NishaAndAditi",10,2500.0);
		
		Runnable r1 = new RunnableEx(ob);
		new Thread(r1,"Nishi").start();
		
		
		Runnable r2 = new RunnableEx(ob);
		new Thread(r2,"Aditi").start();

	}

}
