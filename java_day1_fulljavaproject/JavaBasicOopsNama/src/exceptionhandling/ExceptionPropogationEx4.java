package exceptionhandling;
import java.io.*;
import java.sql.*;

public class ExceptionPropogationEx4 {

	public static void main(String[] args)  {
		
		
		//For runtime exception and its subclasses compiler will not
		//complain (not give compiler error) if you do not handle the exception using try-catch or throws clause
		
		File f = new File("C:\\JavaTrack_VWIT_2024\\java_wrkspc\\JavaBasicOopsNama\\src\\exceptionhandling\\ExceptionEx.java");
		System.out.println("program begins...");
		
		try {
			func1(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		System.out.println("remaining program...");

	}
	
	
	static void func1(File f) throws IOException
	{
	   
				func(f);
				try {
					funcc();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("rem program in func1..");
				
			
		
	}
	
	static void funcc() throws SQLException
	{
		Connection con = DriverManager.getConnection("");	
		
	}
	
	
	static void func(File f) throws IOException 
	{
		
		
		FileReader fr = new FileReader(f);
		FileReader fr1 = new FileReader("abc1.java");
		System.out.println("reading from file...");
		fr.read();
		fr.close();
		fr1.close();
		
		
		
	}

}
