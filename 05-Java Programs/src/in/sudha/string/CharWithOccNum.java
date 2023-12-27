package in.sudha.string;

import java.util.Arrays;

public class CharWithOccNum {

	public static void main(String[] args) {

		String str="opentext";
		char charReplace='t';
		
		//to check given char 
		if(str.indexOf(charReplace)==-1) {
			System.out.println("Given char is not present");
			System.exit(0);
		}
		
		
		//Approach-1
		int cnt=1;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==charReplace) {
				str=str.replaceFirst(str.valueOf(charReplace), str.valueOf(cnt));
				cnt++;
			}
			
		}
		System.out.println(str);  
		//Approach-2

		 char[] character= str.toCharArray();	
         int count=1;
         for(int i=0;i<character.length;i++) {
      	   if(character[i]==charReplace) {
      		   character[i]=String.valueOf(count).charAt(i);//replace ch by value
      		   count++;
      	   }
         }
      System.out.println(Arrays.toString(character)); 
	}

}
