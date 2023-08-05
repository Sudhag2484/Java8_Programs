package in.sudha.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {

	public static void main(String[] args) {

		  String s1 = "RaceCar";
	      String s2 = "CarRace";
	      
	     String S1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
	     String S2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
	     
	     if(S1.equals(S2)) {
	    	 System.out.println("Anagram String");
	     }
	     else {
	    	 System.out.println("Not Anagram String");
	     }
	}

}
