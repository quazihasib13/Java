
public class Emp 
{
	int id;
	String name;
	Address address;
	
	public Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println(id+""+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}
