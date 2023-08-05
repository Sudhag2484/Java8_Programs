package in.sudha.query;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
	
List<Employee> employeeList = new ArrayList<Employee>();
         
employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

//How many male and female employees are there in the organization?
Map<String, Long> countGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
System.out.println(countGender);

//Print the name of all departments in the organization?
employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

//Details of emp in each dept
Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
System.out.println(collect);

//What is the average age of male and female employees?
Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
System.out.println(avgAge);

//Get the details of highest paid employee in the organization?
Employee maxSal = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
System.out.println(maxSal);

//Get the details of lowest paid employee in the organization?
Employee minSal = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get();
System.out.println(minSal);

// Get the names of all employees who have joined after 2015?
employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName)
.forEach(System.out::println);

//Count the number of employees in each department?
Map<String, Long> countEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
System.out.println(countEmp);


//: What is the average salary of each department?
Map<String, Double> avgSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
System.out.println(avgSal);


// Get the details of youngest male employee in the product development department?
Optional<Employee> youngEmp = employeeList.stream().filter(e->e.getDepartment()=="Product Development" && e.getGender()=="Male")
.min(Comparator.comparingInt(Employee::getAge));
System.out.println(youngEmp);

//Who has the most working experience in the organization?
Employee mostExp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();
System.out.println(mostExp);

// How many male and female employees are there in the sales and marketing team?
Map<String, Long> countGenders = employeeList.stream().filter(e->e.getDepartment()=="Sales And Marketing")
.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
System.out.println(countGenders);



Map<String, Double> avgSals = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
System.out.println(avgSals);

// List down the names of all employees in each department?
Set<Entry<String, List<Employee>>> entrySet = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet();
for(Entry<String, List<Employee>> entry:entrySet) {
    System.out.println("--------------------------------------");
	System.out.println("Employees in "+entry.getKey());
    System.out.println("--------------------------------------");

	List<Employee> list = entry.getValue();
	for(Employee e:list) {
		System.out.println(e.getName());
	}
}

//What is the average salary and total salary of the whole organization?
DoubleSummaryStatistics summerizingSal = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
System.out.println("Avg sal of whole org "+summerizingSal.getAverage());
System.out.println("Total sal of whole org "+summerizingSal.getSum());
System.out.println("Max sal of whole org "+summerizingSal.getMax());
System.out.println("Min sal of whole org "+summerizingSal.getMin());

//Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
Set<Entry<Boolean, List<Employee>>> entrySet2 = employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25)).entrySet();
System.out.println("---------------");

for(Entry<Boolean, List<Employee>> entry:entrySet2) {
	if(entry.getKey()) {
		System.out.println("Emp older of age 25 ");
	}else {
		System.out.println("Emp younger"
				+ " of age 25 ");
	}
	System.out.println("---------------");

	List<Employee> list = entry.getValue();
	for(Employee e:list) {
		System.out.println(e.getName());	
}
}
//Who is the oldest employee in the organization? What is his age and which department he belongs to?
Employee employee = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
System.out.println("Name "+employee.getName());
System.out.println("Age "+employee.getAge());
System.out.println("Dept "+employee.getDepartment());

// need to find 1st three employee details based on highest salary?
employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);

//second hightest sal in org
  Employee secondHighSal= employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
  System.out.println("Name and Sal "+secondHighSal.getName()+"-----"+secondHighSal.getSalary());
  
  
  //Highest sal in each Dept
  Map<String, Optional<Employee>> highSal = employeeList.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
		  Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
  Set<Entry<String, Optional<Employee>>> entry = highSal.entrySet();
  for(Entry<String,Optional<Employee>> e:entry) {
	  System.out.println(e.getKey());
	  System.out.println(e.getValue());
	 
	  
  }
	}
}





