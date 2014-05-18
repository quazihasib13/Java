
public class Bird extends Animal
{

	public Bird()
	{
		super();
		System.out.println("Bird created");
	}
	
	@Override
	public void eat()
	{
		System.out.println("Bird eats");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Bird sleeps");
	}
}
