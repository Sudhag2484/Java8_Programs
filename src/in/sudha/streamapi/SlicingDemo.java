package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;

public class SlicingDemo {

	public static void main(String[] args) {
     List<String> course = Arrays.asList("Java","PHP","Rubby","HTML","CSS","Java","CSS");
     course.stream().distinct().forEach(c->System.out.print(c+ " "));
     System.out.println("    ");
     course.stream().skip(3).forEach(c->System.out.print(c+" "));
     System.out.println("   ");
     course.stream().limit(5).forEach(c->System.out.print(c+ " "));
	}

}
