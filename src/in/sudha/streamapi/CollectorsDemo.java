package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person1{
	String name;
	String country;
	public Person1(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
}
public class CollectorsDemo {

	public static void main(String[] args) {

		Person1 p1 = new Person1("Su","India");
		Person1 p2 = new Person1("SuDha","Rusia");
		Person1 p3 = new Person1("Rag","India");
		Person1 p4 = new Person1("Tina","USA");
		
		List<Person1> person = Arrays.asList(p1,p2,p3,p4);
		person.stream().filter(p->p.country.equals("India"))
		      .collect(Collectors.toList())
		      .forEach(i->System.out.println(i.name));

	}

}
