package interfaceex;



public class Tyre implements Bounceable {
	
	int bf;
	public void setBounceFactor(int bf)
	{
		this.bf = Bounceable.BASEBF + bf%2;
	}
	
	public void bounce()
	{
		System.out.println("Tyre is bouncing with bf :"+this.bf);
	}

}
