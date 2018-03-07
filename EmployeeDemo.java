/**
 * Name: EmployeeDemo
 * Authors: Chris Eardensohn (ceardensohn@sandiego.edu)
 * 			Om Kanwar (okanwar@sandiego.edu)
 * Date: 10/03/17
 * Description: Employee demo that will display the employee
 * 				subclass objects to the console with name,
 * 				id, and salary values.
 */
import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		
		//array of emp objects. length of 6
		Employee[] employees = 
			{new Faculty("Jack", 30000.00, 15000.00),
				new Faculty("Liam", 40000.00, 20000.00),
				new Faculty("Mary", 35000.00, 5000.00),
				new Staff("Joe", 20.00, 40),
				new Staff("Adam", 16.00, 40),
				new Staff("Sue", 18.00, 25)
			};
		
		//for loops to print employee obj
		for(int i = 0; i < employees.length; i++)
		{
			System.out.println(employees[i].toString());
		}
		//sort employees from compareTo method
		Arrays.sort(employees);
		System.out.println("Sorting by salary...");
		//reprint array of employees
		for(int j = 0; j < employees.length; j++)
		{
			System.out.println(employees[j].toString());
		}
		
	}

}
