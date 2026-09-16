package coreJava;

import java.util.*;

public class ComparatorExample {
	
	public static void main(String args[])
	{
		List<Employee>  list = Arrays.asList(new Employee("nanaji",20000), new Employee("Divya", 8000));
		Collections.sort(list, new SalaryComparator());
		for(Employee e : list)
		{
			System.out.println("Printing the name as sorting order of salary "+e.getName());
		}
		
	}

}

class Employee
{
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

class SalaryComparator implements Comparator<Employee>
{

	
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getSalary()==e2.getSalary())
		{
			return 0;
		}
		else if(e1.getSalary()>e2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	
	
}