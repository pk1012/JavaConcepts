package concepts;

public class ThisAndSuperKeywords extends SuperClass
{
	int a=20;
	
	public void m()
	{
		System.out.println("base class method");
	}
	
	public ThisAndSuperKeywords()
	{
		this.m();
		System.out.println(this.a);
	}
	
	public static void main(String[] args) 
	{
		ThisAndSuperKeywords tsk = new ThisAndSuperKeywords();		
	}
}

