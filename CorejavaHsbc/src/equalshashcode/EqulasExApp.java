package equalshashcode;

public class EqulasExApp {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1,"Ram",5000);
		
		Emp e2 = new Emp(1,"Ram",5000);
		
		if(e1==e2)
		{
			System.out.println("e1 and e2 are pointing to same object");
		}
		else
		{
			System.out.println("e1 and e2 are not pointing to same object");
		}
		
				
		if(e1.equals(e2))
		{
			System.out.println("e1 and e2 are meaningfully equal");
		}
		else
		{
			System.out.println("e1 and e2 are not meaningfully equal");
		}
		
		
		if(e1.hashCode() == e2.hashCode())
		{
			System.out.println("e1 and e2 are pointing to same object");
		}
		else
		{
			System.out.println("e1 and e2 are not pointing to same object");
		}

	}

}
