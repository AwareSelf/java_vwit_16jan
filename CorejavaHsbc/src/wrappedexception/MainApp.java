package wrappedexception;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 =new Employee(1,5000);
		
		EmpController empcntrl = new EmpController();
		try
		{
		empcntrl.enrollForBonus(e1);
		empcntrl.enrollForBonus(e1);
		
		System.out.println(e1);
		
		}
		catch(Exception ex)
		{
			System.err.println(ex);
			
			System.err.println(ex.getCause().getMessage());
		}
		

	}

}
