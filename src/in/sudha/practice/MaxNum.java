package in.sudha.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaxNum {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        ///Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
      // Integer max = listOfIntegers.stream().reduce(Integer::max).get();
       //int max = listOfIntegers.stream().mapToInt(Integer::intValue).max().getAsInt();
        //Integer max = listOfIntegers.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        int max = listOfIntegers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
        System.out.println(max);
        Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
	}

}
