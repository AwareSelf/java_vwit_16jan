package exceptionhandling;
import java.io.*;
import java.sql.*;

public class ExceptionUsingTryWithResourceEx6 {

	public static void main(String[] args)  {
		
		
		//For runtime exception and its subclasses compiler will not
		//complain (not give compiler error) if you do not handle the exception using try-catch or throws clause
		
		File f = new File("C:\\JavaTrack_VWIT_2024\\java_wrkspc\\JavaBasicOopsNama\\src\\exceptionhandling\\ExceptionEx56.java");
		System.out.println("program begins...");
		
		try {
			func(f);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		System.out.println("remaining program...");

	}
	
	

	
	static void func(File f) throws IOException, SQLException 
	{
		//try-with-resource block auto-closes the resources
		try(FileReader fr = new FileReader(f);
			Connection con = DriverManager.getConnection("");
			)
		{
		
	    char ch = (char)fr.read();
		System.out.println("reading from file..."+ch);
		}
	
	
		
		System.out.println("remaing code inside func");
		
	}

}
