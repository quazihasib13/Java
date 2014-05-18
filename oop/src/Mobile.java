
public class Mobile 
{
	private String manufacturer;
	private String operatingSystem;
	public String model;
	private int cost;
	
	Mobile(String mf, String os, String m, int c)
	{
		this.manufacturer = mf;
		this.operatingSystem = os;
		this.model = m;
		this.cost = c;
	}
	
	public String getMobile()
	{
		return this.model;
	}
	
}
