package in.sudha;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person{
    String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class PredicateDemo3 {

	public static void main(String[] args) {
		
		Person p1=new Person("John",17);
		Person p2=new Person("Jo",12);
		Person p3=new Person("Ahn",18);
		Person p4=new Person("Khn",21);
		
	    List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		  Predicate<Person> person=p->p.age>=17;
		  
		  for(Person per:persons) {
			  if(person.test(per)) {
				  System.out.println(per.name);
			  }
		  }
		

	}

}
