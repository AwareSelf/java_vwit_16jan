package multithreading;

//Thread implements Runnable interface  it has run method
public class MyThread1 extends Thread {

	
	public MyThread1(String threadname)
	{
		super(threadname);
	}
	
	public void run()
	{
		for(int i=1;i<100;i++)
		{
			
	System.out.println(Thread.currentThread().getName()+" i:="+i);
	
	     try
	     {
	
	       Thread.sleep(5000);//influence thread turn taking by sleep
	       
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
	     
		}
	}
}
