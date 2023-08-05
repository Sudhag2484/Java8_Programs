package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {

	public static void main(String[] args) {

		List<String> li = Arrays.asList("Sudha","Sahana","Anu","Banu","Bagu");
		li.stream().filter(i->i.charAt(0)=='S').forEach(i->System.out.println(i));
	}

}
