package in.sudha.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class First3MaxAndMinNum {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Minimum 3 nos ");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        
        System.out.println("Maximux 3 nos ");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	}

}
