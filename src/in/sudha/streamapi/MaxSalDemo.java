package in.sudha.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
	String name;
	int age;
	double sal;

	public Employee(String name, int age, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}

public class MaxSalDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Sona", 18, 18000.00);
		Employee e2 = new Employee("Sana", 19, 19000.00);
		Employee e3 = new Employee("Sonali", 10, 21000.00);
		Employee e4 = new Employee("Sona", 15, 10000.00);

		List<Employee> emp = Arrays.asList(e1, e2, e3, e4);

		//max sal 
		  Optional<Employee> max = emp.stream()
		 .collect(Collectors.maxBy(Comparator.comparing(Employee::getSal)));
		  System.out.println("Employee with max salary:"+(max.isPresent()? max.get():"Not There"));
		 
			/*
			 * Optional<Employee> maxSalaryEmp = emp.stream()
			 * .collect(Collectors.maxBy(Comparator.comparing(Employee::getSal)));
			 * System.out.println( "Employee with max salary:" + (maxSalaryEmp.isPresent() ?
			 * maxSalaryEmp.get() : "Not Applicable"));
			 */
		  //min sal
		  Optional<Employee> min = emp.stream()
		  .collect(Collectors.minBy(Comparator.comparing(Employee::getSal)));
		  System.out.println("Employee with min salary:"+(min.isPresent()? min.get():"Not There"));
		  
		  //avg sal
		  Double avg = emp.stream().collect(Collectors.averagingDouble(Employee::getSal));
		  System.out.println("Employee with avg salary: "+avg);
		  
 /*
			Optional<Employee> max1 = emp.stream()
									.collect(Collectors.maxBy(Comparator.comparing(e -> e.sal)));

			System.out.println("Max Salary :: " + max1.get().sal);

			Optional<Employee> min1 = emp.stream()
										.collect(Collectors.minBy(Comparator.comparing(e -> e.sal)));
			
			System.out.println("Min Salary :: " + min1.get().sal);
			
			Double avgSalary = emp.stream().collect(Collectors.averagingDouble(e -> e.sal));
			System.out.println(avgSalary);
			
	*/
	}

}
