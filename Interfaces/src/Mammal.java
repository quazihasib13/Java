
public class Mammal implements Animal, Else
{

	public void eat()
	{
		System.out.println("Mammals eats");
	}
	
	public void travel()
	{
		System.out.println("Mammals travels");
	}
	
	public int legs()
	{
		return 2;
	}
	
	public void setName(String name)
	{
		System.out.println(""+name);
	}
	
	public void runs()
	{
		System.out.println("Some runs");
	}
}
