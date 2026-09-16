package StreamPrograms.non_string_programs;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHigestSalary {
	
	public static void main(String[] args)
	{
		
		List<Employee> list = List.of(new Employee("nanaji", 80000,"Technical lead"),new Employee("avinash", 60000,"Software Engineer"),
				              new Employee("nagraju", 27000,"Systems Engineer"));
		
		Employee secondHighestSalary = list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).limit(1).findFirst().get();
		OptionalDouble AverageSalary = list.stream().mapToDouble(k -> (double)k.getSalary()).average();
		
		System.out.println("Second Highest salary is "+secondHighestSalary);
		
		System.out.println("Printing the second highest salary "+AverageSalary);
		
	}

}

class Employee
{
	private String name;
	private int salary;
	private String designation;
	
	public Employee(String name, int salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}