package com.sudha;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistProgram1 {
 
	private int id;
	private String name;
	
	public ArraylistProgram1(int id,String name) {
		this.id=id;
		this.name=name;
	}
		public String toString() {
			return id+"----"+name;
		}
	
	
	
	public static void main(String[] args) {

		
		ArrayList<ArraylistProgram1> al = new ArrayList<>();
		
		al.add(new ArraylistProgram1(1,"Sudha"));
		al.add(new ArraylistProgram1(2,"Rani"));
		al.add(new ArraylistProgram1(3,"Sona"));
		al.add(new ArraylistProgram1(4,"Sona"));
		al.add(new ArraylistProgram1(5,null));
		
		Iterator<ArraylistProgram1> iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	
		
		/*al.add("Hi");
		 al.add("Hello");
		 al.add(12.45);
		 al.add(12.12);
		 al.add(null);
		// System.out.println(al);
		// al.remove(3);
		// System.out.println(al);
		// Object a2 = al.get(2);
		 //System.out.println(a2);
		 al.add(5, "sudha");
		// System.out.println(al);
		// int size = al.size();
		// System.out.println(size);
		 //al.set(2,"rani");
		// System.out.println(al);

for(int i=0;i<=al.size();i++) {
	System.out.println(al.get(i));
}

Iterator<Object> iterator = al.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
		 for(Object obj:al) {
			 System.out.println(obj);
		 }
		 */
	}
	
	

}
