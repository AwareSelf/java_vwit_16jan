package abstracclassinterface1;

public abstract class Shape {
	
	private int side1,side2;
	private long ht;
	
	
	
	
	public Shape(int side1) {
		super();
		this.side1 = side1;
	}



	public Shape(int side1, int side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}
	
	
   

	public Shape(int side1, long ht) {
		super();
		this.side1 = side1;
		this.ht = ht;
	}



	public long getHt() {
		return ht;
	}



	public void setHt(long ht) {
		this.ht = ht;
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



	abstract public int calcArea();
	
	

	abstract public int calcPm();
	


}
