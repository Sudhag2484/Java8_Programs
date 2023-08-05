package in.sudha;

public interface Test1 {

	public void start();

	default void m1() {
		System.out.println(" I 1 m1");
	}

	public static void run() {
		System.out.println("I runn");
	}

	public interface Test2 {

		public void start();

		default void m1() {
			System.out.println(" I 2 m1");
		}
	}

	public class Car implements Test1,Test2{
		@Override
		public void m1() {
			Test1.super.m1();
			Test2.super.m1();
		}
		@Override
		public void start() {
			System.out.println("Start the car");
		}
	}
  public static void main(String[] args) {
	Car c=new Car();
	c.m1();
	c.start();
	Test1.run();
}
}
