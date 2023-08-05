package in.sudha;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> c=(name)-> System.out.println(name+" Good Afternoon");
		 c.accept("Ashu");
		 c.accept("Rshu");
		 c.accept("Mashu");
		 c.accept("Lashu");
	}

}
