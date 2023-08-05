package in.sudha;

import java.util.Optional;
import java.util.Scanner;

class User {
	public Optional<String> getName(int id) {
		String name = null;
		if (id == 10) {
			name = "Raj";
		} else if (id == 11) {
			name = "Rani";
		}
		return Optional.ofNullable(name);
	}
}

public class OptionalClassDemo {
	
	public static void main(String[] args) {
		/*
		 * User u=new User(); 
		 * Optional<String> optional = u.getName(11);
		 * System.out.println(optional.get());
		 */

		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Id"); 
		  int id = sc.nextInt();
		  
		  User u= new User();
		  Optional<String> username = u.getName(id);
		  if(username.isPresent()) { 
			  String name = username.get();
		  System.out.println(name.toUpperCase()+" Hello");
		  }else {
		  System.out.println("No data Found"); }
		 
		
	}

}
