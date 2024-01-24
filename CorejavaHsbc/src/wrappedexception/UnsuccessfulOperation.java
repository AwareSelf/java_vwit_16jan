package wrappedexception;

public class UnsuccessfulOperation extends Exception {
	
	public UnsuccessfulOperation(String msg,Exception e)
	{
		super(msg,e);
	}
	
	
	public String toString()
	{
		return "Operation not successful";
	}

}
