package in.sudha.string;

public class CharCount {

	public static void main(String[] args) {

		String str="I am proud to be an Indian";
		
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++ ) {
			if(str.charAt(i)!=0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		//Approach -2 Java 8
		
				long count1 = str.chars().filter(Character::isLetter).count();
				System.out.println(count1);
	}

}
