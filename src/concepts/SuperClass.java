package concepts;

public class SuperClass
{
	public SuperClass()
	{
		System.out.println("super class constructor 1");
	}
	
	public SuperClass(int a)
	{
		this();
		System.out.println("super class constructor 2");
	}
	
	int a=10;
	
	public void m()
	{
		System.out.println("super class method");
	}
}


