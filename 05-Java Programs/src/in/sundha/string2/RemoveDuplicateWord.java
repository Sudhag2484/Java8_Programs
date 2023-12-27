package in.sundha.string2;

public class RemoveDuplicateWord {

	public static void main(String[] args) {

		String str="we are so happy and we are proud";
		
		String[] str1=str.split("");
		
		for(int i=0;i<str1.length;i++) {
			
			if(str1[i]!=null) {
				for(int j=i+1;j<str1.length;j++) {
					if(str1[i].equals(str1[j])) {
						str1[j]=null;
					}
				}
			}
		}
		for(int i=0;i<str1.length;i++) {
			if(str1[i]!=null) {
				System.out.println(str1[i]);
			}
		}
	}

}
