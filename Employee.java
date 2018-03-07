/**
 * Name: Employee
 * Authors: Chris Eardensohn (ceardensohn@sandiego.edu)
 * 			Om Kanwar (okanwar@sandiego.edu)
 * Date: 10/03/17
 * Description: Abstract employee class to house some common
 * 				features of the employee object including a 
 * 				name and id number.
 */
public abstract class Employee implements Comparable<Employee> {
	//private fields
	private String name;
	private int id;
	private static int nextid = 1;
	
	//constructor for abstract employee
	Employee (String empName)
	{
		this.name = empName;
		this.id = nextid;
		nextid++;
	}
	
	//abstract method for getSalary to be overriden
	abstract public double getSalary ();
	
	//returns name of employee object
	public String getName()
	{
		return this.name;
	}
	
	//returns id of employee object
	public int getId()
	{
		return this.id;
	}
	
	//returns string representation of calling obj
	public String toString()
	{
		return "Name: " + getName() + " ID: " 
				+ getId();
	}
	
	//compareTo method for sorting arrays by their salary
	public int compareTo(Employee emp) {
		if (this.getSalary() < emp.getSalary())
		{
			return -1;
		}
		else if (this.getSalary() > emp.getSalary())
		{
			return 1;
		}
		else
		return 0;
	}

}
