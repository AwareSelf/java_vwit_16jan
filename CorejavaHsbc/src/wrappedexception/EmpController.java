package wrappedexception;

import java.sql.SQLException;

public class EmpController {
	
	Dao d;
	
	public EmpController()
	{
		
	
	   	 d = new EmpDao();
	   	 
	   	 
	}
	
	
	   boolean  enrollForBonus(Employee e) throws UnsuccessfulOperation //SQLException
	     {
	    	
	    	  try
	    	  {
	    	    d.add(e);
	    	  }
	    	  catch(SQLException ex)
	    	  {
	    		  System.out.println("exception occure while saveing emp to database");
	    		//  throw ex;
	    		  
	    		  throw new UnsuccessfulOperation("UnsuccessfulOperation",ex);
	    	  }
	    	  return true;
	     }

}
