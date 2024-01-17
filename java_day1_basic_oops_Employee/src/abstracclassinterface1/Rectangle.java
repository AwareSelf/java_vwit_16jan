package abstracclassinterface1;

public class Rectangle extends Shape {
	
	
	  public Rectangle(int side1,int side2)
	    {
	    	super(side1,side2);
	    	
	    }
		
		
		
		@Override
		public int calcArea()
		{
		   return this.getSide1() * this.getSide2();
		}

		@Override
		public int calcPm()
		{
			
			return 2 * (this.getSide1() + this.getSide2());
		}
		
		@Override
		public String toString()
		{
			return "Shape is Rectangle with side1="+this.getSide1()+", side2:"+this.getSide2();
		}
		
		
}
