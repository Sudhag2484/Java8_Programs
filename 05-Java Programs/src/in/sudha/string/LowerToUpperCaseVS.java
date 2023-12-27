package in.sudha.string;

public class LowerToUpperCaseVS {
	
	public static void main(String[] args) {
		String str1= "GrEEn PoWer";
		
		StringBuffer str=new StringBuffer(str1);
		
		for(int i=0;i< str.length();i++) {
			
			if(Character.isLowerCase(str.charAt(i))) {
				str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				str.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
	}
	
System.out.println("Convertion String is "+str);
}
}
