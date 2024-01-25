package exceptionhandling;

public class ExceptionEx {

	public static void main(String[] args) {
		
		
		//For runtime exception and its subclasses compiler will not
		//complain (not give compiler error) if you do not handle the exception using try-catch or throws clause
		
		
		String s = null;
		System.out.println("program begins...");

		
		//s.concat("AAA");
		
	
		
		
		String s1 =" 10 ";
		
		int n = Integer.parseInt(s1.trim());
		System.out.println(n);
		System.out.println("remaining program...");
		

	}

}
