package interfaceex;


//Functional Interface - only 1 abstract method
interface Printable
{
	
	void print();
}

interface Addition
{
	double sum(double a,double b);
}

public class FunctionInterfaceEx {

	public static void main(String[] args) {
		
	   meth(new IntArray(4));
	   
	   //implementing functional interface using lambda function
	   Printable p  = ()->{
		   
		   System.out.println("Hi Everyone!");
	   };
	   
	   p.print();
	   
	   Printable p1 = new Greet();
	   p1.print();
	   
	   
	   Addition ob = (double a,double b)->a+b;
	   
	   System.out.println(ob.sum(100,200));
	   double r = ob.sum(10,20);
	   System.out.println(r);
	}
	
	
	static void meth(Printable p)
	{
		p.print();
	}

}

class Greet implements Printable
{

	@Override
	public void print() {
		 System.out.println("Hi Everyone!");
		
	}
	
}


class IntArray implements Printable
{
	int[] arr;
	
	IntArray(int size)
	{
		this.arr = new int[size];
		for(int i=0,j=0;i<this.arr.length;i++)
		{
			this.arr[i] = ++j;
		}
	}

	@Override
	public void print() {
		
		//for-each loop to iterate and display the array
		for(int ele:arr)
		{
			System.out.println(ele);
		}
	}
	
}
