package in.sudha.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachChar {

	public static void main(String[] args) {

        String str = "Java Concept Of The Day";
        
        String reverse = Arrays.stream(str.split(" "))
        		.map(word->new StringBuffer(word).reverse())
              .collect(Collectors.joining(" "));
        System.out.println(reverse);
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

System.out.println(reversedStr);

	}

}
