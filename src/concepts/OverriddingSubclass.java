package concepts;

public class OverriddingSubclass extends OverriddingSuper
{
	//lower scope to default (compile-time error)
	void m1()
	{

	}

	//increase scope to public
	public void m2()
	{

	}

	//change return-type from int to string (no-longer over-ridden)
	public String m3(String a)
	{
		return a;
	}

	//change arguments (no-longer over-ridden)
	public void m4(long a, char s)
	{

	}
	
	//change sequence of arguments (no-longer over-ridden)
	public void m4( String s, int a)
	{

	}
}


