package in.sudha;

import java.util.function.BiFunction;

public class FunctionDemo2 {

	public static void main(String[] args) {

		
		BiFunction<Integer, Integer, Integer> c=(a,b)->a+b;
		System.out.println(c.apply(12, 15));
		System.out.println(c.apply(42, 15));
		System.out.println(c.apply(82, 15));
		System.out.println(c.apply(89, 15));


	}

}
