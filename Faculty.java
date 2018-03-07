/**
 * Name: Faculty
 * Authors: Chris Eardensohn (ceardensohn@sandiego.edu)
 * 			Om Kanwar (okanwar@sandiego.edu)
 * Date: 10/03/17
 * Description: Concrete Faculty subclass of Employee.
 * 				Faculty stores academic and summer salary 
 * 				values.
 */
public class Faculty extends Employee {
	//private fields
	private double academicSalary;
	private double summerSalary;
	
	//constructor
	Faculty(String empName, double empAcademic, double empSummer)
	{
		super(empName);
		super.getId();
		this.academicSalary = empAcademic;
		this.summerSalary = empSummer;
	}
	
	//methods
	//getSalary that returns annual salary of calling obj
	@Override
	public double getSalary()
	{
		return this.academicSalary + this.summerSalary;
	}
	//toString method to return string rep of calling obj
	public String toString()
	{
		return "Name: " + super.getName() + " ID: " + 
				super.getId() + " Academic salary: $" +
				this.academicSalary + " Summer salary: $" +
				this.summerSalary;
	}
}