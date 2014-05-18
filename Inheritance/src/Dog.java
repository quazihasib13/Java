
public class Dog extends Animal
{

	public Dog()
	{
		super();
		System.out.println("Dog created");
	}
	
	@Override
	public void eat()
	{
		System.out.println("Dog eats");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Dog sleeps");
	}
}
