/**
 * Name: Staff
 * Authors: Chris Eardensohn (ceardensohn@sandiego.edu)
 * 			Om Kanwar (okanwar@sandiego.edu)
 * Date: 10/03/17
 * Description: Concrete Staff subclass of Employee.
 * 				Stores hourly wage and hours worked per week.
 */
public class Staff extends Employee{
	//private fields
	private double wage; 
	private int hours;
	
	//constructor
	Staff(String empName, double empWage, int empHours)
	{
		super(empName);
		super.getId();
		this.wage = empWage;
		this.hours = empHours;	
	}
	
	//methods
	//return annual salary assume 52 weeks worked per year
	@Override
	public double getSalary()
	{
		return (wage*hours*52);
	}
	//toString to return string rep of calling obj
	public String toString()
	{
		return "Name: " + super.getName() + " ID: " + 
				super.getId() + " Hourly wage: $" + wage +
				" Hours per week: " + hours;
	}
}
