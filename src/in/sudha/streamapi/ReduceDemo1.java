package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo1 {

	public static void main(String[] args) {

		int[] num= {1,2,3,1,8};
		int reduce = Arrays.stream(num).reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		
		List<Integer> array = Arrays.asList(-2,0,9,1,3,4);
		Integer sum = array.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
		
		List<String> words = Arrays.asList("Sudha","Rani","Gudagunti");
		Optional<String> longword = words.stream().reduce((word1,word2)->word1.length()>word2.length()? word1:word2);
		//displaying long word
	        longword.ifPresent(System.out::println);	
		}
	}


