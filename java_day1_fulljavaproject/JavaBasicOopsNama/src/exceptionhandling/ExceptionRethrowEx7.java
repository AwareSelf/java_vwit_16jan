package exceptionhandling;
import java.io.*;
import java.sql.*;

public class ExceptionRethrowEx7 {

	public static void main(String[] args)  {
		
		
		//For runtime exception and its subclasses compiler will not
		//complain (not give compiler error) if you do not handle the exception using try-catch or throws clause
		
		File f = new File("C:\\JavaTrack_VWIT_2024\\java_wrkspc\\JavaBasicOopsNama\\src\\exceptionhandling\\ExceptionEx56.java");
		System.out.println("program begins...");
		
		try {
			func(f);
			System.out.println("remaining try block in main..");
		} catch (IOException e) {
			
			System.out.println("handling the remaining exception here in caller..");
			e.printStackTrace();
		}
    
		System.out.println("remaining program...");

	}
	
	

	
	static void func(File f) throws IOException 
	{
		//try-with-resource block auto-closes the resources
		try(FileReader fr = new FileReader(f);
			)
		{
		
	    char ch = (char)fr.read();
		System.out.println("reading from file..."+ch);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		
			//after partially handling the exception, you want
			//do the remaining handling of this situation in its caller function catch block
			//in that case u have re-throw the same exception.
			System.out.println("rethrowing the same exception after partial handling..");
			throw e;
			
			
		}
	
	
	/*	angular ui ->banking rest service java func --> java dao fuc (sql exception partial handling 
		                                          and rethrow to caller rest service)--> db
		amt angular ui --> banking rest meth ->acc.withdraw -> dao db update
		                                                       sqlexception
		                                                       catch sysout details
		                                                     throw sqlexception
		*
		*/ 
		
		System.out.println("remaing code inside func");
		
	}

}
