
public class exercise1
{
	private exercise center;
	private int radius=1;
	
	public exercise1(int x,int y,int r)
	{
		radius=r;
		center.x=x;
		center.y=y;
	}
	
	public exercise1(exercise c,int r)
	{
		center=c;
		radius=r;
	}
	
	public exercise getCenter()
	{
		return center;
	}
	
	public int getCenterX()
	{
		return center.x;
	}
	
	public int getCenterY()
	{
		return center.y;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public void setRadius(int r)
	{
		radius=r;
	}
	
	public void setCenterXY(int x,int y)
	{
		center.x=x;
		center.y=y;
	}
	
	public String toString()
	{
		return "("+center.x+","+center.y+")and radius:"+radius;
	}
	
	public double getArea()
	{
		return 2*3.1416*radius;
	}
}
