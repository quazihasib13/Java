
public class subSalary extends Employee
{

	double subSalary;
	public subSalary(String name, String address, int number, double subSalary)
	{
		super(name, address, number);
		setSalary(subSalary);
	}
	
	public void setSalary(double subSalary)
	{
		this.subSalary = subSalary;
	}
	
	public void mailCheck()
	{
	    System.out.println("Mailing check to " + getName()
	    + " with salary " + subSalary+", address:"+getAddress());
    }
	

}
