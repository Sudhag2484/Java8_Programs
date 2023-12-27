	package in.sudha.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {
	
		public static void main(String[] args) {
	
			String str="God is Greate";
		
			//Approach -1
		/*	str=str.toLowerCase();
			
			char[] str1=str.toCharArray();
			
			StringBuilder sb=new StringBuilder();
			
			for(int i=0;i<str1.length;i++) {
				boolean unique=false;
				for(int j=i+1;j<str1.length;j++) {
					
					if(str1[i]==str1[j]) {
						unique=true;
						break;
						}	
				}
				if(!unique){
				sb.append(str1[i]);
			}
			}
			
			System.out.println(sb);*/
			
			//Approach -2
			Set<Character> unique=new HashSet<>();
			StringBuilder sb=new StringBuilder();
			
			for(char c:str.toCharArray()) {
				
				if(unique.add(c)) {
					sb.append(c);
				}
			}
			System.out.println(sb);
			
			
			//Approach-3
			
			str.chars().distinct().forEach(c -> sb.append((char)c));
			System.out.println(sb);// 2 times printing o/p

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
