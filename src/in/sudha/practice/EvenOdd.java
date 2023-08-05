package in.sudha.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12,11,13,9,18,32,75,2);
		Map<Boolean, List<Integer>> evenodd = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		System.out.println(evenodd.get(true));
		
		System.out.println(evenodd.get(false));
	}

}
