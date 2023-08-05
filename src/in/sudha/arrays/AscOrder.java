package in.sudha.arrays;

import java.util.Arrays;
import java.util.List;

public class AscOrder {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,23,15,18,22,34);
		list.stream().sorted().forEach(System.out::println);
	}

}
