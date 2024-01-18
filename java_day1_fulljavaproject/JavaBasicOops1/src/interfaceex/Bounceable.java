package interfaceex;


//feature-based contract
//declares what features will be provided as part of this contract
//but it does not implement these features
//in a way its like a specifications
public interface Bounceable {
	
	//all properties/variables in interface are by default public,static and final
	int baseBounceFactor = 2;
	
	//all interface methods are public and abstract
	void bounce();
	void setBounceFactor(int bf);

}

//implement - signing contract - implemnts all abstract methods
//if any single abstract method is inherited but not overriden then class as abstract
class Ball implements Bounceable
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

	@Override
	public void setBounceFactor(int bf) {
		
		this.bounceFactor = bf;
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

