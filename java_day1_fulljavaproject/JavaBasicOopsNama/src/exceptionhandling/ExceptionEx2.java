package exceptionhandling;
import java.io.*;


public class ExceptionEx2 {

	public static void main(String[] args) {
		
		
		//For runtime exception and its subclasses compiler will not
		//complain (not give compiler error) if you do not handle the exception using try-catch or throws clause
		
		File f = new File("abc.java");
		System.out.println("program begins...");

		try
		{
		FileReader fr = new FileReader(f);
		System.out.println("reading from file...");
		fr.read();
		fr.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("issue file opening...");
			ex.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("issue file io operation...");
			e.printStackTrace();
		}
	
		
		System.out.println("remaining program...");

	}

}
