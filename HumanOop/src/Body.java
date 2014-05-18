public abstract class Body 
{
	public int handSize;
	public int footSize;
	public int eyeSize;
	
	Body(int handSize, int footSize, int eyeSize)
	{
		this.handSize = handSize;
		this.footSize = footSize;
		this.eyeSize = eyeSize;
	}
	
	public abstract void getHandWork();
	
}
