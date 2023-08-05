package in.sudha;

interface Say{
	public void saying();
}

public class MethodInstanceReference2 {

	public static void m1() {
		System.out.println("Hello Sudha ");
	}
	
	public static void main(String[] args) {

		Say s=MethodInstanceReference2::m1;
		s.saying();
		
	}

}
