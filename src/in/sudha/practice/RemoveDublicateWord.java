package in.sudha.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateWord {

	public static void main(String[] args) {
   
		List<String> list = Arrays.asList("Pen","Pencil","Book","Pen","Book");
		List<String> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
	}

}
