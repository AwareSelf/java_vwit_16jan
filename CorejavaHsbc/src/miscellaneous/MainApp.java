package miscellaneous;

class Dept
{
}

class Manager extends Emp
{
	
}

class Emp
{
}

public class MainApp
{
    public static void main(String[] args)
    {
         Emp e = new Emp();
        if( e instanceof Object)
         
         if(e instanceof Manager)
        {
           System.out.println("e is of type Dept");
         }
       else
       {
          System.out.println("e is not of type Dept");
       }
         
         Manager m = new Manager();
         if(m instanceof Emp)
         {
        	 System.out.println("m is of type Emp"); 
         }
    }
}
