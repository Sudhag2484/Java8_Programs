package in.sudha;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(12);
		al.add(122);
		al.add(91);
		al.add(19);
		al.add(1);
		al.add(10);
		
		System.out.println("Before "+al);
		
		Collections.sort(al,(i,j)->(i>j)? -1:1);
		
		System.out.println("After desc "+al);
	}

}
