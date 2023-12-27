package in.sudha.string;

import java.util.HashMap;
import java.util.Map;

public class FrquencyChar {

	public static void main(String[] args) {

		String str="I love my india and india is my country";
		
		/*
		//Approach-1
		str=str.toLowerCase();
		int fr[] = new int[str.length()];
		
		char[] str1=str.toCharArray();
		
		for(int i=0;i<str1.length;i++) {
			fr[i]=1;
			for(int j=i+1;j<str1.length;j++) {
				if(str1[i]==str1[j]) {
					fr[i]++;
					
					//to avoid same count
					str1[j]='0';
					
				}
			}
		}
		for(int i=0;i<fr.length;i++) {
			if(str1[i]!=' ' && str1[i]!='0') {
				System.out.println(str1[i]+" "+fr[i]);
				
			}
		}*/
		
		//Approach -2 using Collection
	
		Map<Character,Integer> charCount=new HashMap<>();
		
		str=str.replaceAll(" ", "").toLowerCase();
		
		for(char c:str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		System.out.println("Character count is "+charCount);
		
		
		
		
	}

}
