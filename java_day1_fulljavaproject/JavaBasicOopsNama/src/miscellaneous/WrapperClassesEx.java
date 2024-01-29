package miscellaneous;

public class WrapperClassesEx {

	public static void main(String[] args) {
		
		
		//1) int --> Integer object
		{
		int i=12;
		Integer ob = i; //  compiler uses autoboxing: Integer ob = new Integer(i);
		System.out.println(ob);
		}	
		//2) Integer --> int  
		{
		Integer ob = 20;
		int j = ob; //compiler uses auto-unboxing  int j = ob.intValue();
		System.out.println(j);
		}
	    //3) Integer object ob --> primitive byte,short,int,long,float,double etc -- use intValue() method
		{
		Integer ob = 100;	
		byte b = ob.byteValue();
		short s = ob.shortValue();
		int ii = ob.intValue();
		long l = ob.longValue();
		float f = ob.floatValue();
		double d = ob.doubleValue();
		
		
		System.out.println(b); 	System.out.println(s); 	System.out.println(ii);
		System.out.println(l); 	System.out.println(f); 	System.out.println(d);
		}
		//4) primitive int ---> byte,short,int,long,float,double
		{
		 int x  = 100;
		 Integer ob1 = x; //autobox primitve int to Integer object first
		 byte b1 = ob1.byteValue();
		 short s1 = ob1.shortValue();
		 int ii1 = ob1.intValue();
		 long l1 = ob1.longValue();
		 float f1 = ob1.floatValue();
		 double d1 = ob1.doubleValue();
			System.out.println(b1); 	System.out.println(s1); 	System.out.println(ii1);
			System.out.println(l1); 	System.out.println(f1); 	System.out.println(d1);
		}
		
		//5) String --> int
			{
			String s = "  10  ";
			//strip() added in java 11 is more efficient than trim()
			//parseInt: string in decimal format ==> decimal int
			int no = Integer.parseInt(s.strip()); 
			no++;
			System.out.println("string to int:"+no);
		
			//octal 12 is decimal 10
			String oct = "012"; //string in octal format always starts with 0
			System.out.println("string to octal int:"+ Integer.parseInt(oct,8));
		
			}
			
		//6) int --> String
			{
				int no = 10;
				//decimal int ==> decimal string
				String s = Integer.toString(no);
				System.out.println("int to String:"+s);
				
				//decimal int ==> binary String
				s = Integer.toBinaryString(no);
				System.out.println("int to binary String:"+s);
				
				//decimal int ==> hex string
				s = Integer.toHexString(no);
				System.out.println("int to hex String:"+s);
				
				//decimal ==> octal string //decimal 10 = 12 in octal
				s = Integer.toOctalString(no);
				System.out.println("int to octal String:"+s);
				
				//decimal ==> any radix string
				s = Integer.toString(no, 8);
				System.out.println("int to String:"+s);
			}
			
			

	}

}
