package exceptionhandling.userdefined;

import java.util.Scanner;

public class UseAccount {

	public static void main(String[] args) {
		
		Account ob = new Account(1,"Namrata",5000);
		
		
		Scanner sc = new Scanner(System.in);
		String yesno = null;
		do
		{
			System.out.println("Enter amt to withdraw:");
			
			double amt = -1;
			if(sc.hasNextDouble())
		       amt =  sc.nextDouble();
			
			try {
				ob.withdraw(amt);
			} catch (InsufficientBalance e) {
				
			    System.out.println(e);
			    
			}
		/*	catch(NoMinimumBalanceException e)
			{
				
				System.out.println(e);
				break;
			}
			*/
			
			System.out.println("Do u wish to continue:(y/n)");
			yesno =  sc.next();
		
		}while(yesno.toLowerCase().charAt(0)=='y');
		
		System.out.println("Account withdraw program has ended!");
		
	}

}

