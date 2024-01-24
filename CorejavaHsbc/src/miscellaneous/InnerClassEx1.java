package miscellaneous;
interface Bounceable
{
	int baseF=3;
	void bounce();
}
/*
class Ball implements Bounceable
{
	public  void bounce()
	{
		System.out.println("Ball is bouncing...");
	}
}
*/
public class InnerClassEx1 {

	public static void main(String[] args) {
	
	//	Bounceable b = new Ball();
	//	b.bounce();
		
	//	meth(b);
	//	meth(new Ball());
		
		//on-fly creation of anonymous inner class implements an interface
		//am passing it as arg to a method - argument defined anonymous inner class
		meth(new Bounceable() {
			
			public void bounce()
			{
				System.out.println("entity which is bounceable...");
			}
		});
		
		
		Bounceable bx = () -> System.out.println("ball is bounceable");
		meth(bx);
		Bounceable b1 = ()-> {
			System.out.println("a bounceable entity...");
			System.out.println("more than 1 statement..");
		};
		meth(b1);
		
		
		
		

	}
	
	
	static void meth(Bounceable b)
	{
		b.bounce();
	}

}


