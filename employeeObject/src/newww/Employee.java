package newww;

public class Employee {
	private String name;
	private int id;
	private float salary;
	
	public void setDate(String name, int id, float salary) 
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	public float getsalary()
	{
		return salary;
	}
}