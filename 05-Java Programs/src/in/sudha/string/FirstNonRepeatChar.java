package in.sudha.string;

public class FirstNonRepeatChar {

	public static void main(String[] args) {

		String str="ABB BA DACA";
		for(int i=0;i<str.length();i++) {
			boolean unique=true;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)){
					unique=false;
					break;
					
				}
			}
			if(unique) {
				System.out.println(str.charAt(i));
				break;
			}
			
		}
	}

}
