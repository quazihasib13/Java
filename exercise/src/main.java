import java.util.ArrayList;
import java.util.Random;

interface printable
{
	void print();
}

interface showable extends printable
{
	void show();
}


public class main implements showable,printable
{
	public void print()
	{
		System.out.println("Print");
	}
	
	public void show()
	{
		System.out.println("Show");
	}
	public static void main(String args[])
	{ 
//		main obj1=new main();
//		obj1.print();
//		obj1.show();
//		ArrayList<Integer> nums = new ArrayList();
//		Random rand = new Random();
//		while (nums.size() < 5) {
//		int next = rand.nextInt(10);
//		if (!nums.contains(next)) {
//		nums.add(next);
//		}
//		}
//
//		for (int k = 0; k < nums.size(); k++) {
//		System.out.println(nums.get(k));
//		}
		
		String[] a=new String[4];
		
		a[0]="asd";
		a[1]="dsd";
		System.out.println(a.length);

		
	}
}
