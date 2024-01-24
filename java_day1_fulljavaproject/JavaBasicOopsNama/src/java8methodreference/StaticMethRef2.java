package java8methodreference;

@FunctionalInterface
interface Conversion
{
	int convert(String s);
}

public class StaticMethRef2 {
	
	public static void main(String[] args) {
		
	//impl functional interface using lambda
	Conversion c = (s)->Integer.parseInt(s);
	int no = c.convert("10");
	System.out.println(no+1);
	
	//impl functional interface using method reference
	//doing same thing as above using method reference
	Conversion c1 = Integer::parseInt;
	int no1 = c1.convert("10");
	System.out.println(no1+1);
	 
		
	meth((s)->Integer.parseInt(s));
	meth(Integer::parseInt);
	
	}

	static void meth(Conversion c)
	{
		c.convert("11");
	}
}
