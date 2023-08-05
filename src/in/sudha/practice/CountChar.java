package in.sudha.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChar {

	public static void main(String[] args) {

		  String inputString = "Java Concept Of The Day";
		  Map<Character, Long> countChar = inputString.chars()
		             .mapToObj(c->(char)c)
		             .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  System.out.println(countChar);
		  
		  //or
		  
		  Map<Character, Long> characterFrequency = inputString.chars()  // creates an IntStream
				    .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
				    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		  System.out.println(characterFrequency);
		  
		  
	}

}
