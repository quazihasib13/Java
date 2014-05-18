public class Main 
{
	public static void main(String args[])
	{
		Asian obj1 = new Asian(2,45,7);
		System.out.println(obj1.getFootSize());
		obj1.getHandWork();
		
		European obj2 = new European(6, 8, 23);
		System.out.println(obj2.getEyeSize());
		obj2.getHandWork();
	}
}
