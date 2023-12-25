package concepts;

public class ReturnTypeMethod 
{
	public String m (String s)
	{
		return s;
	}
	
	public static void main(String[] args) 
	{
		ReturnTypeMethod rtm = new ReturnTypeMethod();
		System.out.println(rtm.m("Prajwal"));
	}
}


