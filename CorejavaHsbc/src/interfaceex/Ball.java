package interfaceex;


public class Ball implements Bounceable {
	
	int bounceFactor;
	String color;
	
	
	
	public Ball(int bounceFactor, String color) {
		super();
		this.bounceFactor = bounceFactor;
		this.color = color;
	}


	public void setBounceFactor(int bf)
	{
		this.bounceFactor = Bounceable.BASEBF +( this.bounceFactor * bf);
	}
	
	
	public void bounce()
	{
		this.bounceFactor = this.getBounceMultiple();
		System.out.println("Ball is bouncing with "
				+ "bounce-factor:"+this.bounceFactor);
	}
	
	public void roll()
	{
		System.out.println("Ball is rolling");
	}
	
	

}
