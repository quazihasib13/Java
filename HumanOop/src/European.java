
public class European extends Body
{

	European(int handSize, int footSize, int eyeSize) 
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
	
	public void getHandWork()
	{
		{
			if(this.handSize > 20)
			{
				System.out.println("HandSize is over 20");
			}
			else
			{
				System.out.println("HandSize is less 20");
			}
		}
	}
}
