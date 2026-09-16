package StreamPrograms.non_string_programs;


import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class AverageSalary {
	
	public static void main(String[] args)
	{
		
		List<Employee> list = List.of(new Employee("nanaji", 80000,"Technical lead"),new Employee("avinash", 60000,"Software Engineer"),
				              new Employee("nagraju", 27000,"Systems Engineer"));
		
		
		Double AverageSalary = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		
		
		System.out.println("Printing the second highest salary "+AverageSalary);
		
	}

}
