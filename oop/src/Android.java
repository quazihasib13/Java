public class Android extends Mobile
{

	Android(String mf, String os, String m, int c)
	{
		super(mf, os, m, c);
	}
	
	public String getModel()
	{
		return "this is android model"+ this.model;
	}
}
