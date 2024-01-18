package interfaceex;

public class UseInterfaceEx {

	public static void main(String[] args) {
		
		Bounceable b;
		
		b= new Ball("Season");
		b.bounce();
		b.display();
		
		b.setBounceFactor(20);
		b.bounce();
		
		b = new Tyre("MRF");
		b.bounce();
		
		b.setBounceFactor(20);
		b.bounce();
		
		b.display();
		System.out.println(Bounceable.getBaseBounceFactor());
		
		func(b);
		func(new Ball("Rubber"));
		
		

	}
	
	
	 static void func(Bounceable b)
	{
		b.bounce();
		b.setBounceFactor(20);
		b.bounce();
		
		
		b.display();
		System.out.println(Bounceable.getBaseBounceFactor());
		
	}

}
