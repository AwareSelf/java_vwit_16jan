import java.util.*;
import java.sql.*;
import javax.sql.*;
import java.io.*;

public class  PreparedStatementEx
{


	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stat=null;
		String s;
		try
		{
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		
	     // con=DriverManager.getConnection("jdbc:oracle:oci8:@oracle9i","scott","tiger");

		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@saraswati:1521:oracle9i","scott","tiger");
		
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con=DriverManager.getConnection("jdbc:derby:c:/namadbx;create=true;user=nama;password=nama");	
		
	
		System.out.println("The connection is successful.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		


        try
		{
		 stat=con.createStatement();
		 s="create table student1(Rollno int,Name varchar(50),serName varchar(50))";
         stat.executeUpdate(s);
		}
		catch(SQLException e)
		{   
			e.printStackTrace();
		}
		
        Scanner sc = new Scanner(System.in);
        
       
      

         try
		{
 		 s="insert into student1 values(?,?,?)";	
		 PreparedStatement stat1=con.prepareStatement(s);
		 
		 String yesno = null;
		 
		 do
	        {
	        System.out.println("enter studentid:");
	        
	        int id = sc.nextInt();
	        
	        System.out.println("enter studentname:");
	        
	        String name = sc.next();
	        
	        System.out.println("enter studentsername:");
	        
	        String sername = sc.next();
	        
         stat1.setInt(1,id);
		 stat1.setString(2,name);
		 stat1.setString(3,sername);
         int no=stat1.executeUpdate();
		 System.out.println("no of rows inserted:"+no);
		 
		 System.out.println("do u wish to continue (yes/no):");
		 yesno = sc.next();
		 
	        }while(yesno.equals("yes"));
		 
		 
		 

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
		{
		  e.printStackTrace();
		}

		System.out.println("create is successful:");



		try
		{
			
		 stat=con.createStatement();
         s= "update student1 set name='nikhil' where rollno=1";
		 
          int count = stat.executeUpdate(s);
          
          System.out.println("no of rows updated.."+count);

		}
		catch(Exception e) {
			e.printStackTrace();
		}





        try
		{
		 stat=con.createStatement();
         s= "select * from student1";
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
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}


	}
}
