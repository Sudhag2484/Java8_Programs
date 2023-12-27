package in.sudha.string;

public class ReverseChar {

	public static void main(String[] args) {

		String str="java program";
		
		char[] str1 = str.toCharArray();
		
		for(int i=str1.length-1;i>=0;i--) {
			System.out.println(str1[i]);
		}
		
		String[] str2=str.split(" ");
		
		for(int i=str2.length-1;i>=0;i--) {
			System.out.println(str2[i]);
		}
		

	}
	
}
