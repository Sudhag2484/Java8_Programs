package in.sudha.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee1
{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
	public Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	} 
	
}
public class PracticeDemo {

	public static void main(String[] args) {

		List<Employee1> employeeList = new ArrayList<Employee1>();
		
		employeeList.add(new Employee1(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee1(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new Employee1(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee1(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee1(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new Employee1(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new Employee1(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee1(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee1(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new Employee1(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new Employee1(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee1(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new Employee1(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new Employee1(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new Employee1(15, "Ashok", 43, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee1(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
//male and female count
 Map<String, Long> map = employeeList.stream()
		          .collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
 System.out.println(map);
 
 System.out.println("================================");
//distinct dept name
 employeeList.stream()
             .map(Employee1::getDepartment)
             .distinct()
             .forEach(dname->System.out.println(dname));
 System.out.println("================================");
 //avg age of male and female emp
 Map<String, Double> avgAge = employeeList.stream()
 .collect(Collectors.groupingBy(Employee1::getGender,
		 Collectors.averagingInt(Employee1::getAge)));
 System.out.println(avgAge);
 
 System.out.println("================================");
 //max sal of emp 
 Optional<Employee1> maxSal = employeeList.stream()
		 .collect(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)));
//System.out.println("Max sal "+(maxSal.isPresent()? maxSal.get():"Not found"));
 if(maxSal.isPresent()) {
	 Employee1 employee1 = maxSal.get();
	 System.out.println(employee1);
 }
 System.out.println("================================");
 //min sal
 Optional<Employee1> minSal = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee1::getSalary)));
 
 System.out.println("Min Sal Details of Emp "+(minSal.isPresent()?minSal.get():"Not Found"));
 
 System.out.println("================================");
 //joined after 2015
 employeeList.stream().filter(e->e.yearOfJoining>2015)//join after 2015
 .map(e->e.name)//to get name
 .forEach(name->System.out.println(name));//printing details

 System.out.println("================================");
 //counting no of emp in each dept
 Map<String, Long> count = employeeList.stream()
		 .collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
 System.out.println(count);
 
 System.out.println("================================");
 //avg sal of each dept
 Map<String, Double> avgSalEachDept = employeeList.stream()
		 .collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.averagingDouble(Employee1::getSalary)));
 System.out.println(avgSalEachDept);
 
 System.out.println("================================");
 //youngest male emp in "dev" dept
Optional<Employee1> minAge = employeeList.stream().filter(e->e.getGender().equals("Male")&& e.getDepartment().equals("Development"))
 .min(Comparator.comparing(Employee1::getAge));
if(minAge.isPresent()) {
	System.out.println( minAge.get());
}
System.out.println("================================");
//Most exp emp in cmp
Optional<Employee1> mostExp = employeeList.stream()
.collect(Collectors.minBy(Comparator.comparing((Employee1::getYearOfJoining))));
if(mostExp.isPresent()) {
	System.out.println(mostExp.get());
}
System.out.println("================================");
//count male and female employees are there in the Sales team
Map<String, Long> countSalesEmp = employeeList.stream().filter(e->e.getDepartment().equals("Sales"))
.collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
System.out.println(countSalesEmp);
 
System.out.println("================================");
//avg sal for male and female
Map<String, Double> avg = employeeList.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.averagingDouble(Employee1::getSalary)));
 System.out.println(avg);
 System.out.println("================================");
 //Name of emp in each dept
Map<String, List<String>> namesEmp = employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment,
		 Collectors.mapping(Employee1::getName, Collectors.toList())));
// Print names of employees in each department
for (Map.Entry<String, List<String>> entry : namesEmp.entrySet()) {
    String department = entry.getKey();
    List<String> employeeNames = entry.getValue();

    System.out.println("Department: " + department);
    System.out.println("Employees: " + employeeNames);
    System.out.println();
}
 
System.out.println("================================");
 
 //AVg and total sal of whole dept
 OptionalDouble averageSal = employeeList.stream().mapToDouble(Employee1::getSalary).average();
 System.out.println(averageSal);
 double sumSal = employeeList.stream().mapToDouble(Employee1::getSalary).sum();
 System.out.println(sumSal);
 
 System.out.println("================================");
 //emp name whose are >=30 and emp<=40
 Stream<String> map2 = employeeList.stream().filter(e->e.age>30&&e.age<40).map(e->e.getName());
map2.forEach(name->System.out.println(name));
 
System.out.println("================================");
//younger <=25
List<Employee1> collect = employeeList.stream().filter(e->e.getAge()<=25).collect(Collectors.toList());
for(Employee1 e:collect) {
	System.out.println("Yonger-----------"+e.getName());
}
System.out.println("************************");
//older >30
List<Employee1> collect2 = employeeList.stream().filter(e->e.getAge()>30).collect(Collectors.toList());
for(Employee1 e:collect2) {
	System.out.println("Older-----------"+e.getName());
}
System.out.println("================================");
//one old emp i.e max age
Optional<Employee1> optional = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee1::getAge)));
if(optional.isPresent()) {
	System.out.println(optional.get().name);
}
System.out.println("================================");
//if 2 emp are old with same age

// Find the oldest employee(s) with the maximum age
Optional<Employee1> oldestEmployeeOptional = employeeList.stream()
        .max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

// Print the oldest employee(s)
if (oldestEmployeeOptional.isPresent()) {
    Employee1 oldestEmployee = oldestEmployeeOptional.get();
    System.out.println("Oldest employee(s) (age " + oldestEmployee.getAge() + "):");
    employeeList.stream()
            .filter(e -> e.getAge() == oldestEmployee.getAge())
            .forEach(e -> System.out.println(e.getName()));
}

	}

}
