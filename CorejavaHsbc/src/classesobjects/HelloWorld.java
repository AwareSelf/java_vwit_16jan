package classesobjects;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi All!");
		
		double no=12.3;
		System.out.println(no);

		  A ob = new A();
		  ob.meth(5);
		  
		  byte b =6;
		  ob.meth(b);
		  
			Manager m = new Manager();
			
			Manager m1 = new Manager(10,"Shyam",90000,"Sales");
	}

}

class A
{
	
	void meth(byte b)
	{
		System.out.println("first meth"+b);
	}
	
	void meth(int m)
	{
		System.out.println("sec meth"+m);
	}
}