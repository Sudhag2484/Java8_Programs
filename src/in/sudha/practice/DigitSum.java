package in.sudha.practice;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DigitSum {

	public static void main(String[] args) {

		int i=15623;
		Integer sumDigit = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sumDigit);
	}

}
