package in.sudha.streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo {

	public static void main(String[] args) {

		//approach-I
		Stream<Integer> stream  = Stream.of(1,2,3,4,5);
		//System.out.println(stream.count());
		
		//approach-II
		ArrayList<String> name = new ArrayList<>();
		name.add("Sudha");
		name.add("Rani");
		name.add("Jk");
		name.add("Jagga");
		
		Stream<String> stream2 = name.stream();
		//System.out.println(stream2);
		
		
	}

}
