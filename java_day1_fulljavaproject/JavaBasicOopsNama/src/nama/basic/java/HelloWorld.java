package nama.basic.java;

public class HelloWorld {
	
	String greetMsg1; //instance property/object property
	
	static String greetMsg2;

	/**
	 * @param args
	 */
	
	
	void display() //instance method can access instance property
	{
		//System.out.println(greetMsg1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  if(args.length >= 2) { System.out.println(args[0]);
		  System.out.println(args[1]); }
		 
		
		System.out.println("Hi All");
		
		
		HelloWorld ob = new HelloWorld();
		ob.greetMsg1 = "AAA";
		
		
		HelloWorld ob1 = new HelloWorld();
		ob1.greetMsg1 = "BBB";
	//	ob1.greetMsg2 = "kk";
		
		greetMsg2 = "HI Everyone!";
		System.out.println(greetMsg2);
		
		
		
		B.func();
		
		System.out.println(greetMsg2);
		
		
		func1();
		
		

		
		
		int no=6;
		System.out.println(no);
		
	
		
		

	}
	
	
	static void func1()
	{
		
	}

}


class B
{
	
	static void func()
	{
		HelloWorld.greetMsg2 = "Hello";
		System.out.println(HelloWorld.greetMsg2);
		
		
		HelloWorld obb = new HelloWorld();
		obb.greetMsg1 ="hhh";
		obb.display();
	}
	
}