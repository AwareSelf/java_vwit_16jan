package wrappedexception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


//delete namadbx1 database folder at c:/ if already exists as it has emp table created in it
public class EmpDao implements Dao {
	
	List<Employee> list;
	Connection con=null;
	Statement stat=null;
	static boolean tablecreated = false;
	String s;
	
	public EmpDao() 
	{
		try
		{
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	    con=DriverManager.getConnection("jdbc:derby:c:/namadbx1;create=true;user=nama;password=nama");		
		
	     System.out.println("The connection is successful.");
	     
	     createTable();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		list = new ArrayList<Employee>();
	}
	
	
	 void createTable() throws SQLException
	{
		 if(!this.tablecreated)
		 {
	     stat=con.createStatement();
		 s="create table emp(empid int primary key,salary double)";
         stat.executeUpdate(s);
         stat.close();
         
      
		 }
		 tablecreated = true;
	}
	
	public boolean add(Object o) throws SQLException
	{
			Employee e = (Employee) o;
		
		try(Statement stat=con.createStatement();)
		{
			//got an exception while storing emp object in databse
			
			 
			 s="insert into emp values("+e.getEmpid()+","+e.getSalary()+")";
			 stat.executeUpdate(s);
			 
			return true;
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		  throw ex;	
		}
		
		
	}

}
