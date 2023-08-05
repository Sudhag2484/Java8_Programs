package in.sudha;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {

		
		Function<String, Integer> f=(name)->name.length();
		System.out.println(f.apply("SUdharani"));
		System.out.println(f.apply("dharani"));
		System.out.println(f.apply("SU"));
		System.out.println(f.apply("Rani"));

	}

}
