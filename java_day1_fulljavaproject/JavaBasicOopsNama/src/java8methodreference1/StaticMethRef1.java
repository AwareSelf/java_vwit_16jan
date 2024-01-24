package java8methodreference1;

@FunctionalInterface
interface Sayable
{
	void say(String s);
}

public class StaticMethRef1 {
	
	static void sayHello(String name)
	{
		System.out.println("Hi "+name);
	}

	public static void main(String[] args) {
		
	Sayable sy = (str)->System.out.println(str);
	sy.say("namrata");
	
	Sayable sy1 = (str)-> sayHello(str);	
	sy1.say("namrata");
	
	Sayable sy2 = StaticMethRef1::sayHello;
	sy2.say("namrata");
	
	
	
	}

}
