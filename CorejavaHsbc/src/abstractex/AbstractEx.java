package abstractex;

public class AbstractEx {

	public static void main(String[] args) {
	
		func(new Square("red",5));
		func(new Rectangle(5,7));
		
		//using scanner take length and breadth from user
		Rectangle r = new Rectangle(4,6);
		func(r);
		

	}
		
	public static void func(Shape s)
	{
		System.out.println("area:"+s.calcArea());
		System.out.println("pm:"+s.calcPerimeter());
	}

}
