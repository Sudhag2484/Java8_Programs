package in.sudha.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(35);
		
		//Approach -1 using for loop
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println(" ");
		//Approach-2 
		for(Object obj:al) {
			System.out.print(obj+" ");
		}
		System.out.println(" ");
		//approach-3 iterator
		Iterator<Object> il = al.iterator();
		while(il.hasNext()) {
			System.out.print(il.next()+" ");
		}
		System.out.println(" ");
		//approach-4 list iterator
		ListIterator<Object> lil = al.listIterator();
		while(lil.hasNext()) {
			System.out.print(lil.next()+" ");
		}
		System.out.println(" ");
		//approach-5 using java -8
		al.forEach(i->System.out.print(i+" "));
	}

}
