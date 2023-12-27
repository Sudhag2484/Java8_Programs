package in.sudha.string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateChar {

	public static void main(String[] args) {

		String str="Green Powerer is best";
		/*
		//Approach-1
		str=str.toLowerCase();
		char[] str1=str.toCharArray();
		
	for(int i=0;i<str1.length;i++) {
		int count=0;
		for(int j=i+1;j<str1.length;j++) {
			if(str1[i]==str1[j] ){
				count++;
				
				str1[j]='0';
				
			}
		}//inner for
		if(count>0 && str1[i]!='0') {

			System.out.println(str1[i]);
		}
	}//outer for
	
	*/
		Set<Character> uniqueChar=new HashSet<>();
		Set<Character> duplicateChar=new HashSet<>();
		
		for(char c:str.toCharArray()) {
			if(!uniqueChar.add(c)) {
				duplicateChar.add(c);
				
			}
		}
	System.out.println("input "+str);
	System.out.println("Duplicate "+uniqueChar);//uquie char
	System.out.println("Duplicate "+duplicateChar);//duplicate char

}

}
