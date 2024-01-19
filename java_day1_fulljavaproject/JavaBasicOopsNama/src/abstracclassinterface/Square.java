package abstracclassinterface;

public class Square extends Shape {
	

	
    public Square(int side)
    {
    	super(side);
    	
    }
	
	@Override
	public int calcArea()
	{
	   return this.getSide1() * this.getSide1();
	}

	
	  @Override public int calcPm() {
	  
	  return this.getSide1() * 4; 
	  }
	 
}
