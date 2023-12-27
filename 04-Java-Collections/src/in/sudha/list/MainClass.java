package in.sudha.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainClass {

	public static void main(String[] args) {

		/*
		ArrayList<Student> a2 = new ArrayList<>();
		a2.add(new Student(10, "su"));
		a2.add(new Student(11, "ab"));
		a2.add(new Student(12, "cd"));
		a2.add(new Student(13, "ef"));
		a2.add(new Student(14, "gh"));
        a2.add(new Student(15, "jk"));
        
        ListIterator<Student> li = a2.listIterator();
        while(li.hasNext()) {
        	System.out.println(li.next());
        }
        System.out.println("============");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		*/
		
		ArrayList al = new ArrayList();
		al.add("Sudha");
		al.add(101);
		al.add(200.08);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
        al.add("Hyd");
        al.add("Chennai");
		System.out.println(al);

	}
}
	
	class Student{
		int id;
		String name;
		
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
	}


