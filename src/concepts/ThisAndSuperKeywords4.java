package concepts;

public class ThisAndSuperKeywords4 extends SuperClass
{
	int a=20;
	
	public void m()
	{
		System.out.println("base class method");
	}
	
	public ThisAndSuperKeywords4()
	{
		super.m();
		System.out.println(super.a);
	}
	
	public static void main(String[] args) 
	{
		ThisAndSuperKeywords4 tsk = new ThisAndSuperKeywords4();		
	}
}

