package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {

	public static void main(String[] args) {

		List<String> javacourse = Arrays.asList("Java","Phyton","PHP","Ruby");
		List<String> uicourse = Arrays.asList("HTML","CSS","JS","Node.js");
		List<List<String>> course = Arrays.asList(javacourse,uicourse);
		
		course.stream().forEach(s->System.out.println(s));
		course.stream().flatMap(s->s.stream()).forEach(s->System.out.println(s));
		
	}

}
