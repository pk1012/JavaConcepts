package concepts;

public class ConstructorChaining
{
	public ConstructorChaining()
	{
		System.out.println("C1");
	}
	
	public ConstructorChaining(int i)
	{
		this();
		System.out.println("C2");
	}
	
	public ConstructorChaining(int i, String s)
	{
		this(5);
		System.out.println("C3");
	}
	
	public static void main(String[] args)
	{
		new ConstructorChaining(5, "Prajwal");
	}
}
