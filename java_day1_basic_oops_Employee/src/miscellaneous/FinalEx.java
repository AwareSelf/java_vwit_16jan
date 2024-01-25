package miscellaneous;

public class FinalEx {
	
	
	//static final variable has initialized at time of declarartion
	static final int x1=20;  //compile-time constant
	
	
	void func()
	{
		//x1++;
			//System.out.println(x1);
			System.out.println(20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal constant
		final int x;
		
		x=10;
		
		//x++;
		
		
	

	}

}

class B
{
	
	void func()
	{
		System.out.println(FinalEx.x1);
	}
}
