package oopsConcepts;

public class SubClass_DynamicPolymorphism extends SuperClass_DynamicPolymorphism
{
	void m()
	{
		System.out.println("sub class method");
	}
	
	public static void main(String[] args)
	{
		SubClass_DynamicPolymorphism s = new SubClass_DynamicPolymorphism();
		s.m();
		
		SuperClass_DynamicPolymorphism s1 = new SuperClass_DynamicPolymorphism();
		s1.m();
	}
}
