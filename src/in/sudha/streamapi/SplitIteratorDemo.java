package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorDemo {

	public static void main(String[] args) {

		
		List<String> course = Arrays.asList("Java","CSS","HTML","JS");
		Spliterator<String> spliterator = course.stream().spliterator();
		
		spliterator.forEachRemaining(n->System.out.println(n));
	}

}
