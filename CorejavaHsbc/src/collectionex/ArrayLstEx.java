package collectionex;

import java.util.*;

public class ArrayLstEx {
	
	private List<Account> lst; 
	
	
	public ArrayLstEx()
	{
		lst = new ArrayList<Account>();
		
	}
	
	public ArrayLstEx(List<Account> l)
	{
		this.lst = l;
	}
	
	
	public void addAccount(Account ob)
	{
		this.lst.add(ob);
	}
	
	public boolean deleteAccount(Account ob)
	{
		boolean b = this.lst.remove(ob);
		return b;
	}
	
	public void deleteAll()
	{
		this.lst.clear();
	}
	
	public boolean isAccountPresent(Account a)
	{
		return this.lst.contains(a);
	}
	
	public Account getAccount(int acctid)
	{
		
		//enhanced for-each loop
		for(Account c:lst)
		{
			if(c.getAcctNo() == acctid)
			{
				return c;
			}
			
		} 
		
		/*
	      Iterator<Account> it = this.lst.iterator();
			
			while(it.hasNext())
			{
				Account ob = it.next();
				if(ob.getAcctNo() == acctid)
				{
					return ob;
				}
			
			} */
		
		return null;
	}
	
	
	
	void displayAllAccounts()
	{
		System.out.println(this.lst);
	}
	
	void displayAllAccounts(boolean iterate)
	{
		if(iterate)
		{
		Iterator<Account> it = this.lst.iterator();
		
		while(it.hasNext())
		{
			Account ob = it.next();
			System.out.println(ob);
		//	ob.deposit(1000);
		//	System.out.println(ob);
		}
	   }
	   else
	   {
			System.out.println(this.lst);
	   }
	}

}
