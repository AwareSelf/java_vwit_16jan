package abstractex;

public class Rectangle extends Shape {
	
	
	
	public Rectangle(int side1,int side2)
	{
		super(side1,side2);
		
	}
	
	
	
    public  int calcArea()
   {
	   return this.getSide1() * this.getSide2();
   }
	
	public int calcPerimeter()
	{
		return 2 * (this.getSide1() + this.getSide2()); 
	}
	
	
	

}
