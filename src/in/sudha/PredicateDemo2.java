package in.sudha;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {

		
		 String[] names= {"Anu","Su","Ama","Ram"};
		 
		  Predicate<String> p=name->name.charAt(1)=='n';
		  
		  for(String name:names) {
			  if(p.test(name)) {
				  System.out.println(name);
			  }
		  }
	}

}
