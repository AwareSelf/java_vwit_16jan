package junit.nama.junit;

public class Calculator {
	
	
	
   public int integerDivision(int dividend, int divisor)
   {
	   if(divisor!=0)
	   {
		   return dividend/divisor;
		 //  return dividend%divisor;

	   }
	   else
	   {
		   throw new IllegalArgumentException();
	   }
   }
}
