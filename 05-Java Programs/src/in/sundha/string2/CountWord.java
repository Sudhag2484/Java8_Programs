package in.sundha.string2;

import java.util.Arrays;
import java.util.List;

public class CountWord {

	public static void main(String[] args) {

		String str="I am belongs to india";
		
		int length=str.split(" ").length;
		System.out.println(length);
		
		
		//approach-2
		List<String> words=Arrays.asList(str.split(" "));
		int wordCount=words.size();
		System.out.println(wordCount);
	}

}
