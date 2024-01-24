package abstractex;

public abstract class Shape {
	
	private int side1,side2;
	
	private int base,ht;
	private int radius;
	
	//it can be used for Square or circle
	public Shape(int side)
	{
			this.side1 = side;
	    	this.side2 = side;
	}
	
	//it can be used for Shape of type Rectangle
	public Shape(int side1,int side2)
	{
		this.side1 = side1;
		this.side2 = side2;
	}
	
	
	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public abstract int calcArea();
	
	public abstract int calcPerimeter();
	

}
