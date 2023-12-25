package concepts;

public class MethodChaining 
{
	public void m()
	{
		System.out.println("Method 1");
	}
	
	public void m(int a, int b)
	{
		this.m();;
		System.out.println("Method 2");
	}
	
	public void m(int i, String s)
	{
		this.m(1, 2);
		System.out.println("Method 3");
	}
	
	public static void main(String[] args)
	{
		MethodChaining mc = new MethodChaining();
		mc.m(4, "P");
	}
}
