package concepts;

public class NestedClass 
{
	public class class1
	{
		int c1 = 10;
		public void m()
		{
			System.out.println(c1);
		}
		
	}
	
	public class class2 extends class1
	{
		public static void main(String[] args) 
		{
			NestedClass nc = new NestedClass();
			class2 c2 = nc.new class2();
			c2.m();
		}
	}
}
