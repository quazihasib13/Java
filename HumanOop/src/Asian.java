
public class Asian extends Body
{
	Asian(int handSize, int footSize, int eyeSize)
	{
		super(handSize, footSize, eyeSize);
	}
	
	public int getHandSize()
	{
		return this.handSize;
	}
	
	public int getFootSize()
	{
		return this.footSize;
	}
	
	public int getEyeSize()
	{
		return this.eyeSize;
	}
	
	@Override
	public void getHandWork() 
	{
		// TODO Auto-generated method stub
		{
			if(this.handSize > 10)
			{
				System.out.println("HandSize is over 10");
			}
			else
			{
				System.out.println("HandSize is less 10");
			}
		}
	}
}
