package in.sudha.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1="Grab";
		String str2="Brab";
		
		if(str1.length()!=str2.length())
			System.out.println("Not Anagram");
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] st1=str1.toCharArray();
		char[] st2=str2.toCharArray();
		
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		if(Arrays.equals(st1, st2)==true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}


	}

}
