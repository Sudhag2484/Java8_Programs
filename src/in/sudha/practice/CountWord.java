package in.sudha.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWord {

	public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> countWords = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countWords);
        
        Map<String, Long> countWords1 = stationeryList.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(countWords1);
	}

}
