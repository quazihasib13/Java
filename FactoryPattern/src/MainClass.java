
public class MainClass 
{

	public static void main(String[] args)
	{
		ShapeFactory sf = new ShapeFactory();
		Shape s1 = sf.getShape("Circle");
		s1.Draw();
		
		Shape s2 = sf.getShape("Rectangle");
		s2.Draw();
	}
}
