package java8methodreference1;

@FunctionalInterface
interface Conversion
{
	int convert(String s);
}

public class StaticMethRef2 {
	
	public static void main(String[] args) {
		
	
	 Conversion c = (s)->Integer.parseInt(s);
	 c.convert("10");
	 
	 Conversion c1 = Integer::parseInt;
	 c1.convert("10");
	 
	
	
	}

}
