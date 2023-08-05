package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {

		
		List<Integer> li = Arrays.asList(23,89,12,34,19);
		/*
		 * Stream<Integer> streamdata = li.stream();
		 * 
		 * Stream<Integer> streamfilter = streamdata.filter(i->i>20);
		 * streamfilter.forEach(i->System.out.println(i));
		 */
		li.stream().filter(i->i>15).forEach(i->System.out.println(i));
	}

}
