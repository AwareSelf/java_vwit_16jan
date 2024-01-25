package miscellaneous;

public class VarArgEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  func();
		  func(11);
		  func(12,3,4,2);
		  func(1,4);
		 
	}
	
	//var-arg - variable argument list
	static void func(int... nos) // it can accept 0 or more int
	{
		for(int i:nos)
		{
			System.out.println(i);
		}
	}

}

//func(Employee... emparr)