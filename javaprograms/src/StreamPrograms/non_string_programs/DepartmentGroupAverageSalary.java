package StreamPrograms.non_string_programs;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentGroupAverageSalary {
	 public static void main(String[] args) {

	        List<Employee1> employees = Arrays.asList(
	            new Employee1("Alice", "IT", 90000),
	            new Employee1("Bob", "Finance", 85000),
	            new Employee1("Charlie", "IT", 95000),
	            new Employee1("David", "HR", 87000),
	            new Employee1("Eve", "Finance", 82000),
	            new Employee1("Frank", "Sales", 78000),
	            new Employee1("Grace", "HR", 88000),
	            new Employee1("Hank", "Marketing", 73000)
	        );
	        
	     Map<String, Double> map =   employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.averagingDouble(Employee1::getSalary)))
	    		 .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	    				 (a1,a2)-> a1, LinkedHashMap::new));
	     System.out.println("printing the top3 departments with average salary "+map);
	     
	    
	 }

}


class Employee1 {
    private String name;
    private String department;
    private double salary;
    
    
	public Employee1(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

   
}