package in.sudha.practice;

import java.util.stream.IntStream;

public class NaturalSum1to10 {

	public static void main(String[] args) {

		int sum = IntStream.range(1, 11).sum();
		System.out.println(sum);
	}

}
