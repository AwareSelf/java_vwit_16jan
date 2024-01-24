package interfaceex;

public interface Bounceable {
	
	int BASEBF = 5;
	void setBounceFactor(int bf);
	void bounce();
	
	
	default int getBounceMultiple()
	{
		return this.BASEBF*2;
	}
	
	static void meth()
	{
		
	}

}
