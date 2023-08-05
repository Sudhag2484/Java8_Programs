package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;

class Emp{
	String name;
	int age;
	double sal;
	
	public Emp(String name, int age, double sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	
}

public class FilerMapDemo {

	public static void main(String[] args) {

		Emp e1=new Emp("Suma",18,21000.00);
		Emp e2=new Emp("Uma",21,12000.00);
		Emp e3=new Emp("Giri",30,26000.00);
		Emp e4=new Emp("Aara",25,25000.00);
		Emp e5=new Emp("Aku",27,22000.00);
		
		List<Emp> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		/*
		 * list.stream().filter(i->i.sal>=20000.00) 
		 *              .map(i->i.name+"--"+i.age)
		 *              .forEach(i->System.out.println(i));
		 */
		
		list.stream().filter(e->e.sal>=22000.00)
		             .forEach(e->System.out.println(e.name+"="+e.age));
	}

}
