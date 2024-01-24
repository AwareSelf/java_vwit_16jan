import java.util.*;
import java.sql.*;
import javax.sql.*;
import java.io.*;

public class  Drivers48
{


	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stat=null;
		String s;
		try
		{
	//	Class.forName("oracle.jdbc.driver.OracleDriver");
		
	//    con=DriverManager.getConnection("jdbc:oracle:oci8:@oracle9i","scott","tiger");

		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@saraswati:1521:oracle9i","scott","tiger");
		
		
		
		/*Properties p=new Properties();
		p.put("user","scott");
		p.put("password","tiger");*/

		//Driver d=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
		
		//Connection con=d.connect("jdbc:odbc:oradsn",p);

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    con=DriverManager.getConnection("jdbc:odbc:namadsn");

		System.out.println("The connection is successful.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

/*      try
		{
		 stat=con.createStatement();
		 s="create table student(Rollno int,Name varchar2(50),serName varchar2(50))";
         stat.executeUpdate(s);
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		

         try
		{
		 stat=con.createStatement();
		 s="insert into student values(1,'Namrata','Marathe')";
         stat.executeUpdate(s);
 		 s="insert into student values(2,'Arjun','Marathe')";
         stat.executeUpdate(s);
 		 s="insert into student values(3,'Rahul','Marathe')";
         stat.executeUpdate(s);

		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		


        try
		{
		  stat.close();
		}
		catch(SQLException e)
		{}

		System.out.println("create is successful:");
*/
        try
		{
		 stat=con.createStatement();
         s= "select * from employee";
		ResultSet rset=stat.executeQuery(s);
		
		while(rset.next())
			System.out.println(rset.getInt(1)+" "+rset.getString(2)+"    "+rset.getString(3));
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		
        try
		{
		  stat.close();
		  con.close();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}


	}
}
