package ioex.serialization;

import java.io.*;


public class DeSerializationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("c:/tempp/empobj.ser");
		
			
				
		System.out.println("deserializing the employee object back...");
		
		try(
				InputStream in  = new FileInputStream(f);
				ObjectInputStream oi = new ObjectInputStream(in);
				
				//	ObjectInputStream oi = new ObjectInputStream(new FileInputStream(f));	
					)
				
	         {
			 
	        	 Employee ee =(Employee) oi.readObject();
	        	 
	        	 System.out.println("After deserializing Employee:-"+ee);
				
		
	         }
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			catch(ClassNotFoundException ex)
			{
				ex.printStackTrace();
			}
		

	}

}
