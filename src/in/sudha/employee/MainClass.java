package in.sudha.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
System.out.println("********************************************************");
//Print the name of all departments in the organization?
employeeList.stream().map(Employee::getDept).distinct().forEach(System.out::println);
System.out.println("********************************************************");

//Details of emp in each dept
Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
System.out.println(collect);
System.out.println("********************************************************");

//What is the average age of male and female employees?
Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
System.out.println(avgAge);
System.out.println("********************************************************");

//Get the details of highest paid employee in the organization?
Employee maxSal = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSal))).get();
System.out.println(maxSal);

//Get the details of lowest paid employee in the organization?
Employee minSal = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSal))).get();
System.out.println(minSal);
System.out.println("********************************************************");

// Get the names of all employees who have joined after 2015?
employeeList.stream().filter(e->e.getYearOfJoin()>2015).map(Employee::getName)
.forEach(System.out::println);

//Count the number of employees in each department?
Map<String, Long> countEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
System.out.println(countEmp);
System.out.println("********************************************************");


//: What is the average salary of each department?
Map<String, Double> avgSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSal)));
System.out.println(avgSal);
System.out.println("********************************************************");


// Get the details of youngest male employee in the product development department?
Optional<Employee> youngEmp = employeeList.stream().filter(e->e.getDept()=="Product Development" && e.getGender()=="Male")
.min(Comparator.comparingInt(Employee::getAge));
System.out.println(youngEmp);
System.out.println("********************************************************");

//Who has the most working experience in the organization?
Employee employee = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoin)).min(Comparator.comparing(Employee::getYearOfJoin)).get();
System.out.println(employee);

System.out.println("********************************************************");
//second small sal
 Employee secSmallSal = employeeList.stream().sorted(Comparator.comparing(Employee::getSal)).skip(2).findFirst().get();
System.out.println(secSmallSal);

System.out.println("********************************************************");
//second high sal
Employee employee2 = employeeList.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSal))).skip(1)
.findFirst().get();
System.out.println(employee2);

Employee employee3 = employeeList.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).skip(1).findFirst().get();
System.out.println(employee3);

System.out.println("********************************************************");

//How many male and female employees are there in the sales and marketing team?
Map<String, Long> empHr = employeeList.stream().filter(e->e.getDept().equals("HR")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
System.out.println(empHr);

System.out.println("********************************************************");

//What is the average salary of male and female employees?
Map<String, Double> avgSalGen = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSal)));
System.out.println(avgSalGen);
System.out.println("********************************************************");

//List down the names of all employees in each department?
Set<Entry<String, List<Employee>>> entrySet = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept)).entrySet();
for(Entry<String, List<Employee>> e:entrySet) {
	//get dept name
	System.out.println("Employees In :"+e.getKey());
	
	//corresponding emp name
	List<Employee> value = e.getValue();
	for(Employee emp:value) {
		System.out.println(emp.getName());
		}
}
System.out.println("********************************************************");

//What is the average salary and total salary of the whole organization?
DoubleSummaryStatistics summerizingSal = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSal));
System.out.println("Max Sal "+summerizingSal.getMax());
System.out.println("Min Sal "+summerizingSal.getMin());
System.out.println("Avg Sal "+summerizingSal.getAverage());
System.out.println("Sum Sal "+summerizingSal.getSum());
System.out.println("Max Sal "+summerizingSal.getCount());

System.out.println("********************************************************");

//Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
Set<Entry<Boolean, List<Employee>>> entrySet2 = employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25)).entrySet();
for(Entry<Boolean, List<Employee>> e:entrySet2) {
	if(e.getKey()) {
		System.out.println("Greater than 25");
	}else {
		System.out.println("Lesser than 25");
	}
	List<Employee> value = e.getValue();
	for(Employee em:value) {
		System.out.println(em.getName());
	}
}
System.out.println("********************************************************");

//Who is the oldest employee in the organization? What is his age and which department he belongs to?
Employee employee4 = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
System.out.println(employee4.getName());
System.out.println(employee4.getDept());

System.out.println("********************************************************");
//need to find 1st three employee details based on highest salary?
employeeList.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).limit(3).forEach(System.out::println);

System.out.println("********************************************************");
//need to find 1st three employee details based on lowest salary?
employeeList.stream().sorted(Comparator.comparing(Employee::getSal)).limit(3).forEach(System.out::println);

System.out.println("********************************************************");

//Highest sal in each Dept
employeeList.stream().collect(Collectors.groupingBy(e->e.getDept(),Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSal)))));
}
}