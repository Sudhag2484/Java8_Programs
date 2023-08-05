package in.sudha;

interface GetMsg{
	public void getMsg(String msg);
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class MethodConstructorReference {
	
	public static void main(String[] args) {
		GetMsg m=Message::new;
		m.getMsg("Hello Sudha Rani");

	}
}
