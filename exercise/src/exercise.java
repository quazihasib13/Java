
public class exercise 
{
	int x;
	int y;
	
	public exercise()
	{
		x=0;
		y=0;
	}
	
	public exercise(int X,int Y)
	{
		x=X;
		y=Y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setX(int X)
	{
		x=X;
	}
	
	public void setY(int Y)
	{
		y=Y;
	}
	
	public void setXY(int X,int Y)
	{
		x=X;
		y=Y;
	}
	
	 public String toString()
	 {
		 return "("+x+","+y+")";
	 }
	 
	 public double distance(int xx, int yy)
	 {
		 double xDist=this.x-xx;
		 double yDist=this.y-yy;
		 
		 return Math.sqrt(xDist*xDist+yDist*yDist);
	 }
	 
	 public double distance(exercise exer)
	 {
		 double xDist=this.x-exer.x;
		 double yDist=this.y-exer.y;
		 
		 return Math.sqrt(xDist*xDist+yDist*yDist);
	 }
}