package in.sudha.string;

public class CountVowelConsonant {

	public static void main(String[] args) {

		String str="I love my parents and teachers";
		str=str.toLowerCase();
		
	   int cCount=0,vCount=0;	
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i)=='u') {
				vCount++;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				cCount++;
			}
		}
		System.out.println(vCount);
		System.out.println(cCount);
	}

}
