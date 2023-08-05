package in.sudha;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
 
		StringJoiner join = new StringJoiner("==");
		join.add("Sudha");
		join.add("Rani");
		join.add("Ashok");
		join.add("Gudagunti");
		System.out.println(join);
		
		StringJoiner joiner = new StringJoiner("-", "#", "*");
		joiner.add("Sudha");
		joiner.add("Rani");
		joiner.add("Ashok");
		joiner.add("Gudagunti");
		System.out.println(joiner);
	}

}
