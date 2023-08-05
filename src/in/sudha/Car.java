package in.sudha;

public interface Car {

	public abstract void start();

	default void m1() {
		System.out.println("M1 get started");
	}

	default void m2() {
		System.out.println("M2 get started");
	}

	public static void m3() {
		System.out.println("Static method");
	}

	public class DefaultMethod implements Car {

		@Override
		public void start() {
			System.out.println("Car started in car method");
		}
		/*
		 * @Override public default void m2() { System.out.println(""); }
		 */
			
	}

	public static void main(String[] args) {

		
		DefaultMethod c=new DefaultMethod();
		c.start();
		c.m1();
		c.m2();
		Car.m3();
	}

}
