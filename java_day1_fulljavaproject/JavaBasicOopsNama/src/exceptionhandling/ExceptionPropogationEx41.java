package exceptionhandling;
import java.io.*;
import java.sql.*;

public class ExceptionPropogationEx41 {

	public static void main(String[] args)  {
		
		
		//For runtime exception and its subclasses compiler will not
		//complain (not give compiler error) if you do not handle the exception using try-catch or throws clause
		
		File f = new File("C:\\JavaTrack_VWIT_2024\\java_wrkspc\\JavaBasicOopsNama\\src\\exceptionhandling\\ExceptionEx.java");
		System.out.println("program begins...");
		
		try {
			func1(f);
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			func1(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
    
		System.out.println("remaining program...");

	}
	
	
	static void func1(File f) throws IOException, SQLException
	{
		/* its handle or declare
		   not handle and declar
		   so compiler expects u to add either try catch or throws
		   clause
		
		  but if u add both (which is not needed) then at runtime
		  catch block will be checked first
		  if matching catch block is not found then it will
		   propogate the exception
		
		  if matching catch block is found then it will
		  catch block and exception wont be propogated and remain
		 code in that function will excute after catch block
	   */
		     try
		     {
				func(f);
				
					funcc();
		     }
		     catch (IOException | SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("inside catch block of func1"+e.getMessage());
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
