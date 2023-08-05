package in.sudha;

public class MethodStaticReference {

	public static void saySomething() {
		System.out.println("Saying that Good Guy");
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(MethodStaticReference::saySomething);
		t1.start();

	}

}
