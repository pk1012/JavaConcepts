package oopsConcepts;

public class SubClass_Casting extends SuperClass_Casting
{
	public void m1()
	{
		System.out.println("sub class m1");
	}
	
	public void m2()
	{
		System.out.println("sub class m2");
	}
	
	public static void main(String[] args) 
	{
		SuperClass_Casting c = new SubClass_Casting();
		
		c.m1();
		c.m2();
		c.m3();
	}
}
