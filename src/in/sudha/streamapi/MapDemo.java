package in.sudha.streamapi;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("uk","usa","rusia","india");
		list.stream().map(i->i+"--"+i.toUpperCase()).forEach(i->System.out.println(i));
		list.stream().map(i->i+"--"+i.length()).forEach(i->System.out.println(i));
		
	}

}
