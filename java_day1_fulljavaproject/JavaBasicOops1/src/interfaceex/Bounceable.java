package interfaceex;


//feature-based contract
//declares what features will be provided as part of this contract
//but it does not implement these features
//in a way its like a specifications

//abstract,default,static
public interface Bounceable {
	
	//all properties/variables in interface are by default public,static and final
	 int baseBounceFactor = 2;
	 
	
	//all interface methods are public and abstract
	void bounce();
	void setBounceFactor(int bf);
	
    static int getBaseBounceFactor()
	{
		return baseBounceFactor;
	}
    
    
    default void display()
    {
    	System.out.println("This is bounceable interface, anythings thats bounceable can implement this..");
    }
    
	
	

}


//functional interface which has only 1 abstract method inside it
//can have default and static methods as well
 interface Rollable
{
	void roll();
	default void display()
    {
    	System.out.println("This is rollable interface, anythings thats rollable can implement this..");
    }
}

//implement - signing contract - implemnts all abstract methods
//if any single abstract method is inherited but not overriden then class as abstract
class Ball implements Bounceable,Rollable
{
	String ballType;
	int bounceFactor;
	
	Ball(String ballType)
	{
		this.bounceFactor = Bounceable.baseBounceFactor * 5;
		this.ballType = ballType;
		
	}
	@Override
	public void bounce() {
		
		System.out.println(ballType+ " Ball is bouncing with bounce factor:"+this.bounceFactor);
	}

	public void display()
	{
		Rollable.super.display();
		Bounceable.super.display();
	}
	
	
	@Override
	public void setBounceFactor(int bf) {
		
		this.bounceFactor = bf;
	}
	@Override
	public void roll() {
		System.out.println(ballType+ " Ball is rolling...");
		
	}
	
}


class Tyre implements Bounceable
{
	String company;
	int bounceFactor;
	
	Tyre(String company)
	{
		this.company = company;
		this.bounceFactor = Bounceable.baseBounceFactor;
	}

	@Override
	public void bounce() {
		System.out.println(company +" Tyre is bouncing with bounce factor:"+this.bounceFactor);
		
	}

	@Override
	public void setBounceFactor(int bf) {
		
		this.bounceFactor = bf;
		
	}
	
}

/*
class Toy implements Bounceable
{

	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBounceFactor(int bf) {
		// TODO Auto-generated method stub
		
	}
	
}
*/

