package in.sudha;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Emp{
	
	String name;
	String loc;
	String dept;
	public Emp(String name, String loc, String dept) {
		this.name = name;
		this.loc = loc;
		this.dept = dept;
	}
}
public class PredicateDemo4 {

	public static void main(String[] args) {
		
		Emp e1=new Emp("Su", "Hyd", "DB");
		Emp e2=new Emp("Rahda", "Bng", "DB");
		Emp e3=new Emp("Ama", "Hyd", "MS");
		Emp e4=new Emp("Pshu", "Mys", "DD");
		
		List<Emp> Emps = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Emp> p1=e->e.loc.equals("Hyd");
		Predicate<Emp> p2=e->e.dept.equals("DB");
		Predicate<Emp>p3=e->e.name.startsWith("A");
		
		Predicate<Emp> p=(p1.and(p2)).or(p3);
		
		for(Emp emp:Emps) {
			if(p.test(emp)) {
				System.out.println(emp.name);
			}
		}
		
		

	}

}
