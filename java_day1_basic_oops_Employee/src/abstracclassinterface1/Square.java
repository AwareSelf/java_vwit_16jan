package abstracclassinterface1;

public abstract class Square extends Shape {
	

	
    public Square(int side)
    {
    	super(side);
    	
    }
	
	@Override
	public int calcArea()
	{
	   return this.getSide1() * this.getSide1();
	}

	
	
	 
}
