package interfaceex;



public class InterfaceApp {

	public static void main(String[] args) {
		
		Bounceable b = new Ball(3,"red");
		b.setBounceFactor(5);
		b.bounce();
		
		func(new Ball(5,"green"));
        func(b);
       
        Tyre t = new Tyre();
        t.setBounceFactor(3);
        t.bounce();
        
        func(t);
        
	}
	
	
	static void func(Bounceable b)
	{
		b.bounce();
		
		if(b instanceof Ball)
		{
			((Ball)b).roll();
		}
	}
	
	
	

}
