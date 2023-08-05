package in.sudha.streamapi;

import java.util.stream.Stream;

class User{
	String name;
	int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
public class FilterDemo3 {

	public static void main(String[] args) {

		User u1=new User("Sudha",24);
		User u2=new User("Ram",16);
		User u3=new User("Raj",14);
		User u4=new User("Jay",28);
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4);
		
		stream.filter(i->i.age>=18)
		      .filter(i->i.name.startsWith("J"))
		      .forEach(i->System.out.println(i.name));
	}

}
