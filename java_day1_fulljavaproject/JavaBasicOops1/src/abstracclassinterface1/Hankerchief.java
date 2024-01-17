package abstracclassinterface1;

public class Hankerchief extends Square {
	
	String color;
	
	
	 public Hankerchief(int side,String color) {
		super(side);
		this.color = color;
	
	}

	@Override public int calcPm() {
		  
		  return this.getSide1() * 4; 
		  }
	
	
	@Override
	public String toString()
	{
		return "Hankerchief with color:"+this.color+" of shape type Square with side ="+this.getSide1();
	}
		 

}
