package oopsConcepts;


public class GetSet 
{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) 
	{
		GetSet gs = new GetSet();
		gs.setId(101);
		gs.setName("Prajwal");
		
		System.out.println(gs.getId());
		System.out.println(gs.getName());
	}
}
