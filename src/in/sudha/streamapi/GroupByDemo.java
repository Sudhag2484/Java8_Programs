package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Test {
	String name;
	String country;
	int age;

	public Test(String name, String country, int age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", country=" + country + ", age=" + age + "]";
	}

}

public class GroupByDemo {

	public static void main(String[] args) {

		Test t1 = new Test("Ram", "India", 24);
		Test t2 = new Test("Raj", "USA", 21);
		Test t3 = new Test("Rani", "India", 29);
		Test t4 = new Test("Raki", "UK", 14);
		Test t5 = new Test("JK", "India", 25);

		List<Test> test = Arrays.asList(t1, t2, t3, t4, t5);

		 Map<String,List<Test>> employeeMap
	        = test.stream().collect(Collectors.groupingBy(Test::getCountry));
	    System.out.println("Employees grouped by Country");
	    employeeMap.forEach((String key, List<Test> empList) -> System.out.println(key +" -> "+empList));
		
		/*
		Map<String, List<Test>> data = test.stream().collect(Collectors.groupingBy(Test::getCountry));
           

        // Iterate over the map and print the details
        for (Map.Entry<String, List<Test>> entry : data.entrySet()) {
            String country = entry.getKey();
            List<Test> employees = entry.getValue();

            System.out.println("Country: " + country);
            for (Test employee : employees) {
                System.out.println(employee.toString());
            }
            System.out.println();
        }
        
        */
	}

}
