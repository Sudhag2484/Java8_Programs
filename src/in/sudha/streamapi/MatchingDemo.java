package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;

class Person{
	String name;
	String country;
	
	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
}
public class MatchingDemo {
	
	public static void main(String[] args) {
		
		Person p1=new Person("John","India");
		Person p2=new Person("Hhn","UK");
		Person p3=new Person("Koi","India");
		Person p4=new Person("Loi","USA");
		
		List<Person> person = Arrays.asList(p1,p2,p3,p4);
		
		boolean anyMatch = person.stream().anyMatch(p->p.country=="India");
		System.out.println("Any match for India country? "+anyMatch);
		
		boolean anyMatch2 = person.stream().anyMatch(p->p.country.equals("India"));
		System.out.println("Any Match? "+anyMatch2);
		
		 boolean allMatch = person.stream().allMatch(p->p.country.equals("Rusia"));
		 System.out.println("All match? "+allMatch);
		 
		 boolean noneMatch = person.stream().noneMatch(p->p.country.equals("Mexico"));
		 System.out.println("None Match? "+noneMatch);

	}

}
