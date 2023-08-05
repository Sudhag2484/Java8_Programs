package in.sudha.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatNum {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,23,15,18,22,34,15,22);
		Set<Integer> set=new HashSet();
		list.stream().filter(n->!set.add(n)).forEach(System.out::println);
	}

}
