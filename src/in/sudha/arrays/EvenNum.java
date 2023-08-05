package in.sudha.arrays;

import java.util.Arrays;
import java.util.List;

public class EvenNum {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,23,15,18,22,34);
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
