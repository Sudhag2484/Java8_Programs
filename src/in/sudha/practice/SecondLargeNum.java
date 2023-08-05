package in.sudha.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargeNum {

	public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer secLarge = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
         System.out.println(secLarge);
	}

}
