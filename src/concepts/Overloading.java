package concepts;

public class Overloading 
{
	public static void m1()
	{
		System.out.println("static m1");
	}

	static void m1()
	{
		System.out.println("default m1");
	}
	
	public void m1()
	{
		System.out.println("non-static m1");
	}
	 
	
	public static void m2(int a, String s)
	{
		System.out.println("static m2");
	}
	
	public static void m2(String s, int a)
	{
		System.out.println("static m2");
	}
	
	public static void m3(int c)
	{
		System.out.println("static m3");
	}
	
	public static int m3(int c)
	{
		System.out.println("static m3");
		return c;
	}
}
