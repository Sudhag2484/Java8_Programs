package in.sudha.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedWord {

	public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
 
        Entry<String, Long> mostRepeatedWord = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                              .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Reapted word = "+mostRepeatedWord.getKey());
        System.out.println("Reapted word count = "+mostRepeatedWord.getValue());
        
	
	}
}
