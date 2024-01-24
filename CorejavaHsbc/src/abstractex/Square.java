package abstractex;

public class Square extends Shape {
	
	String color;
	
	public Square(String color,int side)
	{
		super(side);
		this.color = color;
	}
	
	
	
   public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



   public  int calcArea()
   {
	   return this.getSide1() * this.getSide1();
   }
	
	public int calcPerimeter()
	{
		return this.getSide1() * 4;
	}
	
	
	

}
