package in.sudha.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNum {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,23,15,18,22,34);
		Integer max = list.stream().max(Integer::compare).get();
		System.out.println(max);
		
	}

}
